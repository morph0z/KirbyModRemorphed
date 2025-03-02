// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCrashNukeBOOOOOOm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crashnukeboooooom"), "main");
	private final ModelPart bone;

	public ModelCrashNukeBOOOOOOm(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(25, 24)
						.addBox(-4.0F, -2.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(2.0F, -2.0F, -3.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 28)
						.addBox(2.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 28)
						.addBox(-4.0F, -3.0F, 0.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.0F, -10.0F, 5.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 19)
						.addBox(-1.0F, -9.0F, 6.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(-2.0F, -10.0F, 7.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
						.addBox(-3.0F, -11.0F, 4.0F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -12.0F, -6.0F, 8.0F, 9.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -10.0F, -8.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-3.0F, -11.0F, -7.0F, 6.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 24)
						.addBox(0.0F, -6.0F, 4.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 24)
						.addBox(0.0F, -12.0F, 4.0F, 0.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 6)
						.addBox(0.0F, -13.0F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 5)
						.addBox(0.0F, -3.0F, 5.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(7, 5)
						.addBox(0.0F, -4.0F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 5)
						.addBox(0.0F, -13.0F, 7.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 25.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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