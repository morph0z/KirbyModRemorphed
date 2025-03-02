// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbigboyarmour<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bigboyarmour"), "main");
	private final ModelPart Head;
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart rightleg2;
	private final ModelPart leftleg2;

	public Modelbigboyarmour(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.rightleg2 = root.getChild("rightleg2");
		this.leftleg2 = root.getChild("leftleg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition head2 = Head.addOrReplaceChild("head2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 37.0F, -9.0F));

		PartDefinition cube_r1 = head2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 48)
						.addBox(-6.0F, -24.0F, 38.4F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(46, 53)
						.addBox(2.0F, -24.0F, 38.4F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r2 = head2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(66, 0)
						.addBox(-6.0F, -48.0F, -0.6F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 70)
						.addBox(2.0F, -48.0F, -0.6F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -49.0F, -9.6F, 6.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-7.0F, -49.0F, -9.6F, 6.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 8)
						.addBox(-7.0F, -44.0F, 16.4F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(22, 24)
						.addBox(1.0F, -44.0F, 16.4F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition mask = head2.addOrReplaceChild("mask",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -48.0F, 3.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 26)
						.addBox(1.0F, -49.0F, 3.4F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(79, 0)
						.addBox(2.0F, -50.0F, 3.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 59)
						.addBox(-8.0F, -49.0F, 3.4F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 48)
						.addBox(-7.0F, -50.0F, 3.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 48)
						.addBox(-7.0F, -41.0F, 3.4F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-5.0F, -39.0F, 3.4F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -38.0F, 3.4F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(-1.0F, -36.0F, 3.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 79)
						.addBox(-2.0F, -37.0F, 3.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(-1, 89)
						.addBox(-4.0F, 0.0F, -2.35F, 8.0F, 12.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(16, 32)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition waist = Body.addOrReplaceChild("waist",
				CubeListBuilder.create().texOffs(110, 27)
						.addBox(-4.0F, -22.0F, -4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 4)
						.addBox(-3.0F, -23.0F, -4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 34)
						.addBox(-3.0F, -16.0F, -3.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 29.0F, 1.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(109, 110)
						.addBox(-3.35F, -2.0F, -2.35F, 4.35F, 12.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(27, 30)
						.addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(59, 109)
						.addBox(-4.0F, 1.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(109, 110)
						.addBox(-1.0F, -2.0F, -2.35F, 4.35F, 12.0F, 4.7F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.25F)).texOffs(106, 69)
						.addBox(-1.0F, 1.0F, -3.0F, 5.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition rightleg2 = partdefinition.addOrReplaceChild("rightleg2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-1.15F, 12.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition rightjoint1 = rightleg2.addOrReplaceChild("rightjoint1", CubeListBuilder.create(),
				PartPose.offset(3.9F, 12.0F, 3.0F));

		PartDefinition rightjoint2 = rightleg2.addOrReplaceChild("rightjoint2", CubeListBuilder.create(),
				PartPose.offset(3.9F, 12.0F, 3.0F));

		PartDefinition cube_r4 = rightjoint2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(22, 61)
						.addBox(-12.0F, -7.0F, 0.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-13.0F, -2.0F, 0.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(65, 19)
						.addBox(-12.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 70)
						.addBox(-11.0F, -3.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 39)
						.addBox(-13.0F, -4.0F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(-13.0F, -2.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 48)
						.addBox(-10.0F, -2.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(30, 77)
						.addBox(-13.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(69, 79)
						.addBox(-7.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.75F, 0.0F, -5.75F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r5 = rightjoint2.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(4, 21)
						.addBox(5.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 10)
						.addBox(6.0F, -9.0F, -1.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.95F, 0.0F, -3.35F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftleg2 = partdefinition.addOrReplaceChild("leftleg2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(1.4F, 12.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftjoint2 = leftleg2.addOrReplaceChild("leftjoint2", CubeListBuilder.create(),
				PartPose.offset(-10.9F, 12.0F, 4.25F));

		PartDefinition cube_r6 = leftjoint2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(12.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 36)
						.addBox(6.0F, -9.0F, -1.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 10)
						.addBox(6.0F, -7.0F, 0.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(62, 52)
						.addBox(6.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(5.0F, -4.0F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(42, 23)
						.addBox(5.0F, -2.0F, 0.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(21, 3)
						.addBox(5.0F, -2.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 57)
						.addBox(7.0F, -3.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 16)
						.addBox(5.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 39)
						.addBox(8.0F, -2.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(73, 42)
						.addBox(11.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -7.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftjoint1 = leftleg2.addOrReplaceChild("leftjoint1", CubeListBuilder.create(),
				PartPose.offset(-10.9F, 12.0F, 4.25F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.rightleg2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftleg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}