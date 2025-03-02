// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmmmmn<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mmmmn"), "main");
	private final ModelPart bb_main;

	public Modelmmmmn(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-7.0F, -23.0F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(36, 46)
						.addBox(-2.0F, -19.0F, -8.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 9)
						.addBox(-3.0F, -18.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(-4.0F, -17.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(2.0F, -18.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 0)
						.addBox(3.0F, -17.0F, -8.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 46)
						.addBox(-2.0F, -26.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 28)
						.addBox(2.0F, -26.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 43)
						.addBox(-9.0F, -26.0F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(6.0F, -26.0F, -2.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(4.0F, -20.0F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 31)
						.addBox(4.0F, -16.0F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 37)
						.addBox(6.0F, -12.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(2.0F, -12.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 37)
						.addBox(-9.0F, -12.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 34)
						.addBox(-2.0F, -12.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -12.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 8)
						.addBox(-5.5F, -26.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 28)
						.addBox(-9.0F, -16.0F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-9.0F, -20.0F, -2.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 56)
						.addBox(-2.0F, -18.0F, -9.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}