// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldxccc<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dxccc"), "main");
	private final ModelPart bone;

	public Modeldxccc(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(28, 2)
						.addBox(-4.0F, -8.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 2)
						.addBox(3.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 2)
						.addBox(-4.0F, -8.0F, -5.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 5)
						.addBox(-4.0F, -2.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(37, 4)
						.addBox(6.0F, -25.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 1)
						.addBox(7.0F, -29.15F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 2)
						.addBox(-10.0F, -25.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 8)
						.addBox(-10.5F, -29.0F, -5.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bone.xRot = headPitch / (180F / (float) Math.PI);
	}
}