// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmoley<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "moley"), "main");
	private final ModelPart hole;
	private final ModelPart bone2;
	private final ModelPart bb_main;

	public Modelmoley(ModelPart root) {
		this.hole = root.getChild("hole");
		this.bone2 = root.getChild("bone2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition hole = partdefinition.addOrReplaceChild("hole", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone5 = hole.addOrReplaceChild("bone5", CubeListBuilder.create(),
				PartPose.offset(2.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone5.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(58, 38)
						.addBox(-9.0F, -3.0F, 6.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 75)
						.addBox(-9.0F, -2.0F, -12.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-8.0F, -4.0F, -12.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 76)
						.addBox(-8.0F, -4.0F, -12.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(10, 36)
						.addBox(-7.0F, -6.0F, -11.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 75)
						.addBox(-5.0F, -5.0F, -11.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 71)
						.addBox(-3.0F, -4.0F, -12.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 68)
						.addBox(1.0F, -7.0F, -11.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 54)
						.addBox(-1.0F, -4.0F, -12.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 71)
						.addBox(3.0F, -6.0F, -11.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(11, 27)
						.addBox(5.0F, -3.0F, -12.0F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(5.0F, -4.0F, -12.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone4 = hole.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-2.0F, 0.0F, -1.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = bone4.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(10, 67)
						.addBox(1.0F, -7.0F, -12.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 4)
						.addBox(-3.0F, -4.0F, -13.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 4)
						.addBox(-5.0F, -5.0F, -12.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 67)
						.addBox(-7.0F, -6.0F, -12.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 11)
						.addBox(-8.0F, -4.0F, -12.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 60)
						.addBox(-8.0F, -4.0F, -13.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 69)
						.addBox(-1.0F, -4.0F, -12.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 58)
						.addBox(3.0F, -6.0F, -13.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 32)
						.addBox(5.0F, -4.0F, -12.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 4)
						.addBox(5.0F, -3.0F, -13.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition bone3 = hole.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition cube_r3 = bone3.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 58)
						.addBox(1.0F, -9.0F, -8.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 58)
						.addBox(-3.0F, -6.0F, -9.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 67)
						.addBox(-5.0F, -7.0F, -8.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-8.0F, -8.0F, -8.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(-7.0F, -6.0F, -9.0F, 2.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 68)
						.addBox(-1.0F, -6.0F, -8.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 4)
						.addBox(3.0F, -8.0F, -9.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(62, 56)
						.addBox(5.0F, -6.0F, -8.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 75)
						.addBox(5.0F, -5.0F, -9.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition bone = hole.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(55, 4)
						.addBox(5.0F, -2.0F, -11.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 32)
						.addBox(5.0F, -3.0F, -10.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
						.addBox(3.0F, -5.0F, -11.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 75)
						.addBox(-1.0F, -3.0F, -10.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 11)
						.addBox(-7.0F, -3.0F, -11.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-8.0F, -5.0F, -10.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 58)
						.addBox(-5.0F, -4.0F, -10.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(67, 65)
						.addBox(-3.0F, -3.0F, -11.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(52, 68)
						.addBox(1.0F, -6.0F, -10.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(-1.4F, 23.7F, 0.0F));

		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.25F, -20.5F, -8.0F, 16.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(1.75F, -24.5F, -11.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 58)
						.addBox(1.75F, -24.5F, 7.0F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 38)
						.addBox(-5.25F, -22.5F, -7.0F, 14.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r6 = bone2
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(0, 27).addBox(-9.0F, -11.0F, -8.0F, 16.0F, 9.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.4F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 13)
						.addBox(-7.65F, -19.0F, -1.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 57)
						.addBox(-7.65F, -20.0F, 1.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 6)
						.addBox(-7.65F, -20.0F, 2.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-7.65F, -20.0F, 5.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 0)
						.addBox(-7.65F, -19.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 57)
						.addBox(-7.65F, -20.0F, -2.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.65F, -19.0F, -7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 3)
						.addBox(-7.65F, -20.0F, -6.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 7)
						.addBox(-7.65F, -20.0F, -5.0F, 0.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.4F, 0.3F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition bone7 = bone2.addOrReplaceChild("bone7", CubeListBuilder.create(),
				PartPose.offset(-0.1F, -0.9F, 0.7F));

		PartDefinition cube_r8 = bone7.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(11, 0).addBox(7.25F, -11.75F, -0.5F, 0.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.215F, -0.0376F, 0.1705F));

		PartDefinition cube_r9 = bone7.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(48, 2)
						.addBox(-8.95F, -9.0F, 8.2F, 17.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(8.25F, -9.0F, -8.5F, 0.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.5F, 1.2F, -0.7F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone7.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(-9.65F, -9.0F, -8.1F, 18.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 37)
						.addBox(-10.0F, -9.0F, -8.0F, 0.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 1.2F, -0.7F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bone7.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(30, 43)
						.addBox(-11.5F, -2.3F, -6.0F, 0.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-11.5F, -4.3F, -7.0F, 0.0F, 2.0F, 15.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.5F, 1.2F, -0.7F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r12 = bone7
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(0, 35).addBox(-12.2F, -2.3F, -8.0F, 0.0F, 2.0F, 17.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.5F, 1.2F, -0.7F, 0.0F, 0.0F, 0.4363F));

		PartDefinition bone6 = bone2.addOrReplaceChild("bone6", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone6.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0).addBox(-9.25F, -16.5F, -4.0F, 3.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.7854F, -0.1309F));

		PartDefinition cube_r14 = bone6
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(6, 58).addBox(-11.3F, -15.5F, -1.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bone6
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(48, 56).addBox(-9.25F, -16.5F, -4.0F, 3.0F, 4.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r16 = bone6.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 27).addBox(-9.25F, -16.5F, -1.0F, 3.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.1309F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r17 = bb_main
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(48, 11).addBox(-8.0F, -5.0F, -8.0F, 16.0F, 5.0F, 16.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		hole.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}