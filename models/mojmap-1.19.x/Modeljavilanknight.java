// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljavilanknight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "javilanknight"), "main");
	private final ModelPart bone;

	public Modeljavilanknight(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(24, 40)
						.addBox(3.0F, -7.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(-7.0F, -7.0F, -7.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(34, 32)
						.addBox(3.0F, -7.0F, 3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 36)
						.addBox(-7.0F, -7.0F, 3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -18.0F, -4.0F, 10.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(28, 23)
						.addBox(-5.0F, -18.0F, -5.0F, 10.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 28)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-5.0F, -14.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 19)
						.addBox(4.0F, -14.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 9)
						.addBox(5.0F, -12.0F, -5.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(16, 22)
						.addBox(-6.0F, -12.0F, -5.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 40)
						.addBox(-3.0F, -6.0F, -6.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 0)
						.addBox(-3.0F, -6.0F, 4.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(4.0F, -6.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(29, 0)
						.addBox(-6.0F, -6.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-2.0F, -8.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-9.0F, -11.0F, -5.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -11.0F, -8.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(14, 19)
						.addBox(-9.0F, -12.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 19)
						.addBox(-9.0F, -10.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-10.0F, -11.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-8.0F, -11.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

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