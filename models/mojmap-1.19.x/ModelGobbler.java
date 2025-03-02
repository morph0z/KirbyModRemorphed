// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGobbler<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gobbler"), "main");
	private final ModelPart bb_main;

	public ModelGobbler(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 60)
						.addBox(-4.0F, -14.0F, 13.0F, 8.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-5.0F, -15.0F, -4.0F, 10.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 66)
						.addBox(-2.0F, -11.5F, 14.0F, 4.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 56)
						.addBox(-1.0F, -10.5F, 16.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 71)
						.addBox(-1.0F, -13.5F, 19.0F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(68, 7)
						.addBox(-0.45F, -10.1F, 19.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 0)
						.addBox(-11.0F, -15.0F, 1.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 48)
						.addBox(5.0F, -15.0F, 1.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -15.0F, -1.0F, 10.0F, 12.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(64, 43)
						.addBox(-6.4F, -11.3F, 1.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 48)
						.addBox(-5.0F, -15.0F, -8.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 10)
						.addBox(-5.0F, -6.8F, -8.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 56)
						.addBox(-5.0F, -13.8F, -10.0F, 1.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 50)
						.addBox(4.0F, -13.8F, -10.0F, 1.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(114, 24)
						.addBox(5.1F, -9.6F, -23.0F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(99, 2)
						.addBox(-5.1F, -9.6F, -23.0F, 0.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(11, 26)
						.addBox(2.0F, -6.4F, -24.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 26)
						.addBox(-3.0F, -6.4F, -24.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 60)
						.addBox(-0.5F, -4.4F, -24.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-1.0F, -6.4F, -24.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 10)
						.addBox(-4.0F, -9.4F, -24.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-5.0F, -9.6F, -23.0F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(62, 58)
						.addBox(-3.0F, -11.8F, -14.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 33)
						.addBox(-4.0F, -11.8F, -12.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 10)
						.addBox(-1.0F, -12.9F, -16.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 48)
						.addBox(-0.5F, -13.9F, -16.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 33)
						.addBox(-3.0F, -13.0F, -16.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 3)
						.addBox(4.0F, -14.0F, -15.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 48)
						.addBox(2.0F, -13.0F, -16.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 48)
						.addBox(-5.0F, -14.0F, -15.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 59)
						.addBox(4.0F, -13.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 67)
						.addBox(-5.0F, -13.0F, -13.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(62, 55)
						.addBox(-4.0F, -11.0F, -16.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 19)
						.addBox(-5.0F, -11.0F, -15.0F, 10.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(4.0F, -2.0F, -22.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-5.0F, -2.0F, -22.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 56)
						.addBox(-5.0F, -2.0F, -19.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 56)
						.addBox(4.0F, -2.0F, -19.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -5.8F, -22.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 56)
						.addBox(-5.0F, -5.8F, -22.0F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(44, 67)
						.addBox(4.0F, 8.7F, -22.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 18)
						.addBox(-5.0F, 8.7F, -22.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 10)
						.addBox(-12.0F, -15.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-8.0F, -10.0F, -4.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 38)
						.addBox(-11.0F, -15.0F, -4.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -30.0F, 8.0F, 0.0F, -1.5708F, 3.1416F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(48, 28).addBox(-21.7F, -0.7F, -4.0F, 13.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -30.0F, 8.0F, -1.5708F, -0.6981F, -1.5708F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(62, 61).addBox(-6.4F, -11.3F, -4.0F, 5.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(64, 38).addBox(-13.7F, -8.7F, -4.0F, 5.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -1.0F, 3.1416F, 0.0F, 2.7925F));

		PartDefinition cube_r9 = bb_main
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(34, 66).addBox(-13.7F, -8.7F, -4.0F, 5.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r10 = bb_main
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(54, 67).addBox(-10.0F, -4.5F, 8.0F, 2.0F, 9.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 11.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 26)
						.addBox(-2.0F, -15.0F, 5.0F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 26)
						.addBox(-2.0F, -15.0F, -8.0F, 4.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-2.0F, -18.0F, -8.0F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(24, 29)
						.addBox(-2.0F, -3.0F, -8.0F, 4.0F, 3.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}