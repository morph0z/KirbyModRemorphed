// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwaddal<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "waddal"), "main");
	private final ModelPart bone;

	public Modelwaddal(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-6.0F, -14.0F, -6.0F, 12.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -7.0F, -7.0F, 14.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(83, 103)
						.addBox(-4.0F, -31.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 103)
						.addBox(-3.0F, -30.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 103)
						.addBox(-7.0F, -30.0F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 103)
						.addBox(-6.0F, -31.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 103)
						.addBox(-5.0F, -32.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(83, 103)
						.addBox(-5.0F, -27.0F, 0.0F, 1.0F, 19.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, -0.3927F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 38).addBox(-6.0F, -2.0F, -9.0F, 5.0F, 2.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = bone
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(35, 25).addBox(1.0F, -2.0F, -9.0F, 5.0F, 2.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(22, 40).addBox(1.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.3927F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(42, 0).addBox(-6.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, -0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}