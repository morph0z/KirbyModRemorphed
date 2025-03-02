// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelcapsulJ<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "capsulj"), "main");
	private final ModelPart bone;

	public ModelcapsulJ(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-4.0F, -10.0F, -6.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 35).addBox(1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(13, 36).addBox(-5.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(-4.7F, -11.0F, 6.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.7F, -12.0F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(1.7F, -11.9F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 30)
						.addBox(-5.3F, 0.0F, 5.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 20)
						.addBox(0.2F, 0.1F, 5.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(16, 20)
						.addBox(0.7F, -10.9F, 6.0F, 4.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(31, 36).addBox(-3.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r5 = bone
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(40, 9).addBox(-1.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}