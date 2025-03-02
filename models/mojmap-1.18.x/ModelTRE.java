// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTRE<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "tre"),
			"main");
	private final ModelPart bb_main;

	public ModelTRE(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(75, 0)
						.addBox(-7.0F, -4.0F, -7.0F, 14.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(119, 6)
						.addBox(-6.0F, -8.0F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 150)
						.addBox(-5.0F, -51.0F, -5.0F, 10.0F, 43.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(75, 125)
						.addBox(-26.0F, -66.0F, -11.0F, 25.0F, 25.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(-14.0F, -76.0F, -11.0F, 25.0F, 25.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(75, 75)
						.addBox(-2.0F, -66.0F, -11.0F, 25.0F, 25.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(75, 25)
						.addBox(-14.0F, -66.0F, -24.0F, 25.0F, 25.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-13.0F, -66.0F, 1.0F, 25.0F, 25.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, -59.0F, -11.0F, 25.0F, 25.0F, 25.0F, new CubeDeformation(0.0F)).texOffs(0, 150)
						.addBox(-1.0F, -25.0F, -8.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
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