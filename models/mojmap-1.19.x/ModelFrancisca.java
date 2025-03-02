// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFrancisca<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "francisca"), "main");
	private final ModelPart bb_main;

	public ModelFrancisca(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(12, 47)
						.addBox(4.0F, -5.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-5.0F, -5.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(10, 62)
						.addBox(-4.0F, -5.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 61)
						.addBox(-4.0F, -5.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 26)
						.addBox(-4.6F, -12.5F, -5.0F, 9.2F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 38)
						.addBox(-4.6F, -12.5F, 4.0F, 9.2F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 10)
						.addBox(-4.6F, -12.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 32)
						.addBox(3.6F, -12.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(63, 4)
						.addBox(-4.0F, -15.5F, -4.5F, 8.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(12, 35)
						.addBox(-5.0F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(60, 18)
						.addBox(-5.0F, -3.0F, 5.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 16)
						.addBox(5.0F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(10, 60)
						.addBox(-5.0F, -3.0F, -5.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(25, 64)
						.addBox(6.6F, -8.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(122, 12)
						.addBox(7.35F, -9.5F, -0.25F, 1.5F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(53, 66)
						.addBox(6.6F, -10.5F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 62)
						.addBox(-9.4F, -8.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(39, 28)
						.addBox(-9.4F, -10.5F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 89)
						.addBox(-8.65F, -9.5F, -0.25F, 1.5F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, -20.5F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 0)
						.addBox(4.0F, -15.5F, -4.5F, 0.5F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(110, 0)
						.addBox(-4.4F, -15.5F, -4.5F, 0.5F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(111, 68)
						.addBox(-4.0F, -15.5F, 4.0F, 8.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(38, 18)
						.addBox(2.0F, -6.0F, -5.5F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -6.0F, -5.5F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 3)
						.addBox(-3.5F, -3.0F, -5.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(2.5F, -3.0F, -5.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 18)
						.addBox(-2.0F, -15.0F, 5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(-3.0F, -15.0F, -5.5F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(6, 45)
						.addBox(-2.0F, -15.0F, -5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 3)
						.addBox(-3.0F, -15.0F, -5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 7)
						.addBox(-3.0F, -15.0F, 5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(6, 29)
						.addBox(2.0F, -15.0F, 5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 48)
						.addBox(0.0F, -15.0F, 5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 29)
						.addBox(2.0F, -15.0F, -5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(0.0F, -15.0F, -5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
						.addBox(0.0F, -15.0F, -5.5F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-5.25F, -28.5F, -5.0F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.25F, -27.5F, -6.0F, 13.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(4.75F, -21.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 49)
						.addBox(-5.25F, -21.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(52, 12)
						.addBox(-4.25F, -21.5F, -5.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 15)
						.addBox(-4.25F, -21.5F, 3.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 20)
						.addBox(-4.25F, -20.5F, -4.0F, 8.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 22)
						.addBox(-4.25F, -20.5F, 3.0F, 8.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 50)
						.addBox(4.25F, -20.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(58, 57)
						.addBox(-5.25F, -20.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(4.0F, -19.5F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(57, 47)
						.addBox(-5.0F, -19.5F, -4.0F, 1.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(44, 0).addBox(4.0F, -17.5F, 5.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.1745F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(46, 50)
						.addBox(4.0F, -18.5F, -2.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 47)
						.addBox(4.0F, -18.5F, -4.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(4.0F, -18.5F, -6.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, -0.1309F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(37, 64)
						.addBox(6.0F, -19.5F, 2.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 48)
						.addBox(6.0F, -19.5F, 0.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 29)
						.addBox(6.0F, -19.5F, -2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(6.0F, -19.5F, -4.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(65, 66).addBox(-5.0F, -19.5F, -7.0F, 1.0F, 7.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, -0.1309F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(12, 47)
						.addBox(-5.0F, -16.5F, 8.4F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 65)
						.addBox(-5.0F, -16.5F, 9.0F, 1.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.4363F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-12.0F, -16.5F, -2.0F, 1.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-12.0F, -16.5F, -4.0F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 18)
						.addBox(-12.0F, -16.5F, 2.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r10 = bb_main
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(40, 38).addBox(-5.6F, -3.5F, -5.0F, 1.0F, 2.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(42, 26).addBox(4.65F, -3.5F, -5.0F, 1.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

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