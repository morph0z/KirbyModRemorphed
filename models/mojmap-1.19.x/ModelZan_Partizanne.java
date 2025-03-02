// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelZan_Partizanne<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "zan_partizanne"), "main");
	private final ModelPart bb_main;

	public ModelZan_Partizanne(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(71, 60)
						.addBox(-4.6F, -12.5F, -5.0F, 9.2F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 63)
						.addBox(3.6F, -12.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-9.4F, -8.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 28)
						.addBox(-9.4F, -10.5F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 7)
						.addBox(-8.65F, -9.5F, -0.25F, 1.5F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-4.0F, -6.0F, -5.5F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -6.0F, -5.5F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(50, 32)
						.addBox(-5.0F, -3.0F, -5.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(59, 48)
						.addBox(-5.0F, -5.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(25, 38)
						.addBox(-5.0F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(66, 14)
						.addBox(-4.0F, -5.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 61)
						.addBox(-4.6F, -12.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(71, 48)
						.addBox(-4.6F, -12.5F, 4.0F, 9.2F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(4.0F, -5.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(38, 17)
						.addBox(5.0F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(50, 63)
						.addBox(-4.0F, -5.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 48)
						.addBox(-5.0F, -3.0F, 5.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 72)
						.addBox(6.6F, -10.5F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 4)
						.addBox(7.35F, -9.5F, -0.25F, 1.5F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(6.6F, -8.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(76, 23)
						.addBox(-4.0F, -15.5F, -4.5F, 8.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(4.0F, -15.5F, -4.5F, 0.5F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(50, 66)
						.addBox(-4.0F, -15.5F, 4.0F, 8.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(69, 2)
						.addBox(-4.4F, -15.5F, -4.5F, 0.5F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(42, 11)
						.addBox(-4.0F, -20.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(88, 115)
						.addBox(-5.0F, -21.5F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(35, 48)
						.addBox(-5.0F, -20.5F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(13, 48)
						.addBox(4.0F, -20.5F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(25, 50)
						.addBox(-4.0F, -20.5F, 4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(4.0F, -17.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(4.0F, -16.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(-5.0F, -16.5F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -17.5F, -5.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 36)
						.addBox(-5.25F, -28.5F, -5.0F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(12, 61)
						.addBox(4.75F, -21.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 34)
						.addBox(-4.25F, -21.5F, -5.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(25, 54)
						.addBox(-4.25F, -20.5F, -4.0F, 8.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.25F, -27.5F, -6.0F, 13.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(64, 17)
						.addBox(-5.25F, -21.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(25, 56)
						.addBox(-4.25F, -20.5F, 3.0F, 8.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 70)
						.addBox(4.25F, -20.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(50, 29)
						.addBox(-4.25F, -21.5F, 3.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 72)
						.addBox(-5.25F, -20.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(122, 0).addBox(-1.0F, -20.5F, -5.0F, 2.0F, 0.9F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(118, 46).addBox(2.0F, -20.5F, -5.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(118, 0).addBox(-6.0F, -20.5F, -5.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -0.0435F, 0.0038F, 0.0872F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 36)
						.addBox(0.0F, -15.0F, 5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 6)
						.addBox(2.0F, -15.0F, 5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(0.0F, -15.0F, -5.5F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(9, 6)
						.addBox(2.0F, -15.0F, -5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 36)
						.addBox(0.0F, -15.0F, -5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(47, 51).addBox(4.65F, -3.5F, -5.0F, 1.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r7 = bb_main
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(59, 60).addBox(-5.6F, -3.5F, -5.0F, 1.0F, 2.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(32, 36)
						.addBox(-2.0F, -15.0F, -5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 36)
						.addBox(-3.0F, -15.0F, -5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 18)
						.addBox(-3.0F, -15.0F, 5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 36)
						.addBox(-2.0F, -15.0F, 5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 47)
						.addBox(-3.0F, -15.0F, -5.5F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

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