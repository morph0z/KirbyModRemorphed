// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldwap_o_waou_aau<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dwap_o_waou_aau"), "main");
	private final ModelPart bb_main;

	public Modeldwap_o_waou_aau(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(38, 34)
						.addBox(-6.0F, -2.0F, -5.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-7.0F, -4.0F, -6.0F, 13.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -10.0F, -7.0F, 15.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-7.0F, -12.0F, -6.0F, 13.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(38, 20)
						.addBox(-6.0F, -14.0F, -5.0F, 11.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(-5.0F, -16.0F, -4.0F, 9.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 46)
						.addBox(-4.0F, -18.0F, -3.0F, 7.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-3.0F, -19.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
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