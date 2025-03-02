// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkinggolem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kinggolem"), "main");
	private final ModelPart bb_main;

	public Modelkinggolem(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(1, 0)
						.addBox(-12.0F, -62.0F, -8.0F, 24.0F, 62.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(72, 66)
						.addBox(-24.0F, -4.0F, -6.0F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(12.0F, -4.0F, -6.0F, 12.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(88, 20)
						.addBox(-24.0F, -7.0F, -5.0F, 12.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(39, 86)
						.addBox(12.0F, -7.0F, -5.0F, 12.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 82)
						.addBox(-24.0F, -7.0F, -5.0F, 12.0F, 3.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(78, 86)
						.addBox(-12.0F, -2.0F, -14.0F, 24.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(12, 116)
						.addBox(-12.0F, -62.0F, -12.0F, 5.0F, 25.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(-12.0F, -37.0F, -12.0F, 2.0F, 35.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(93, 93)
						.addBox(10.0F, -37.0F, -12.0F, 2.0F, 35.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(88, 47)
						.addBox(-10.0F, -8.0F, -12.0F, 20.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(88, 38)
						.addBox(-10.0F, -37.0F, -12.0F, 20.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 116)
						.addBox(-2.0F, -42.0F, -19.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(105, 93)
						.addBox(7.0F, -62.0F, -12.0F, 5.0F, 25.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 104)
						.addBox(-7.0F, -62.0F, -12.0F, 14.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -54.0F, -12.0F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(12, 104)
						.addBox(-7.0F, -44.0F, -12.0F, 14.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 116)
						.addBox(-12.0F, -69.0F, -12.0F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(127, 11).addBox(-8.0F, -69.0F, 8.0F, 5.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r2 = bb_main
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(88, 55).addBox(-12.0F, -69.0F, -12.0F, 9.0F, 7.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(127, 22)
						.addBox(-8.0F, -69.0F, 8.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(112, 62)
						.addBox(-12.0F, -69.0F, -12.0F, 9.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(108, 0).addBox(-12.0F, -69.0F, -12.0F, 9.0F, 7.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r5 = bb_main
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(30, 127).addBox(-8.0F, -69.0F, 8.0F, 5.0F, 7.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bb_main
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(48, 127).addBox(-8.0F, -69.0F, 8.0F, 5.0F, 7.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r7 = bb_main
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(112, 73).addBox(9.0F, -57.0F, -14.0F, 10.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r8 = bb_main
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(128, 78).addBox(-19.0F, -53.0F, -14.0F, 10.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(12.0F, -35.0F, -14.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 82)
						.addBox(11.0F, -37.0F, -14.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(108, 11)
						.addBox(-20.0F, -35.0F, -14.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 100)
						.addBox(-21.0F, -37.0F, -14.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(68, 0)
						.addBox(12.0F, -12.0F, -9.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 130)
						.addBox(20.0F, -12.0F, -9.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(131, 83)
						.addBox(56.0F, -12.0F, -9.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(132, 38)
						.addBox(48.0F, -12.0F, -9.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 132)
						.addBox(48.0F, -12.0F, -9.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-36.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(116, 115)
						.addBox(12.0F, -7.75F, -10.75F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(125, 48)
						.addBox(48.0F, -7.75F, -10.75F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.0F, 0.5F, -0.7F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(71, 120)
						.addBox(12.0F, -7.75F, -10.75F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(123, 93)
						.addBox(20.0F, -7.75F, -10.75F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(123, 103)
						.addBox(56.0F, -7.75F, -10.75F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(98, 125)
						.addBox(48.0F, -7.75F, -10.75F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(120, 125)
						.addBox(48.0F, -7.75F, -10.75F, 4.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-36.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(68, 7)
						.addBox(12.0F, -12.0F, -9.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(131, 113)
						.addBox(48.0F, -12.0F, -9.5F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-32.0F, 0.5F, -0.7F, 0.6109F, 0.0F, 0.0F));

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