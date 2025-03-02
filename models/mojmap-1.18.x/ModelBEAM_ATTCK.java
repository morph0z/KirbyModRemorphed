// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBEAM_ATTCK<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "beam_attck"), "main");
	private final ModelPart swwwwoad;

	public ModelBEAM_ATTCK(ModelPart root) {
		this.swwwwoad = root.getChild("swwwwoad");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition swwwwoad = partdefinition.addOrReplaceChild("swwwwoad",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-5.0F, -10.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(-4.0F, -13.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = swwwwoad.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(56, 41).addBox(-1.0F, -26.75F, -35.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r2 = swwwwoad.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(48, 39).addBox(-2.0F, -30.75F, -30.0F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r3 = swwwwoad.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(45, 1).addBox(-2.0F, -25.75F, -39.25F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r4 = swwwwoad.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(42, 39).addBox(-3.0F, -39.0F, -11.0F, 6.0F, 4.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		swwwwoad.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.swwwwoad.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.swwwwoad.xRot = headPitch / (180F / (float) Math.PI);
	}
}