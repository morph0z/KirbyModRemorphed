// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelswordknight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "swordknight"), "main");
	private final ModelPart dwholemask;
	private final ModelPart shoulderright;
	private final ModelPart shoulderleft;
	private final ModelPart body;
	private final ModelPart leftfoot;
	private final ModelPart rightfoot;
	private final ModelPart lefthand;
	private final ModelPart righthand;
	private final ModelPart everything;

	public Modelswordknight(ModelPart root) {
		this.dwholemask = root.getChild("dwholemask");
		this.shoulderright = root.getChild("shoulderright");
		this.shoulderleft = root.getChild("shoulderleft");
		this.body = root.getChild("body");
		this.leftfoot = root.getChild("leftfoot");
		this.rightfoot = root.getChild("rightfoot");
		this.lefthand = root.getChild("lefthand");
		this.righthand = root.getChild("righthand");
		this.everything = root.getChild("everything");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition dwholemask = partdefinition.addOrReplaceChild("dwholemask",
				CubeListBuilder.create().texOffs(13, 29)
						.addBox(-2.0F, -16.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-3.0F, -15.0F, -3.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-3.0F, -13.0F, 2.0F, 6.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 34)
						.addBox(2.0F, -15.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 34)
						.addBox(-3.0F, -15.0F, -2.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition cube_r1 = dwholemask.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 40)
						.addBox(3.0F, -4.75F, -4.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.0F, -6.75F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(8.0F, -6.75F, -3.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 40)
						.addBox(8.0F, -4.75F, -4.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -6.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r2 = dwholemask.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(11, 22)
						.addBox(-1.0F, -9.0F, -1.0F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(17, 0)
						.addBox(-1.0F, -10.0F, 2.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -6.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r3 = dwholemask.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 23)
						.addBox(-1.0F, -10.0F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-1.0F, -10.0F, -0.25F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -9.0F, -1.25F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -6.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition MAXSK = dwholemask.addOrReplaceChild("MAXSK", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -6.0F, -1.0F));

		PartDefinition maskp = MAXSK.addOrReplaceChild("maskp", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r4 = maskp
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(22, 34).addBox(3.2943F, -8.0266F, -2.0F, 2.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition mask = MAXSK
				.addOrReplaceChild("mask",
						CubeListBuilder.create().texOffs(26, 38).addBox(-2.6905F, -8.6252F, -2.0F, 3.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition MAXSKl = dwholemask.addOrReplaceChild("MAXSKl", CubeListBuilder.create(),
				PartPose.offset(-3.0F, -3.3F, -1.0F));

		PartDefinition maska = MAXSKl.addOrReplaceChild("maska", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r5 = maska
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(12, 35).addBox(1.8207F, -7.8075F, -2.0F, 3.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition masko = MAXSKl.addOrReplaceChild("masko", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r6 = masko
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(12, 14).addBox(-1.8679F, -7.7189F, -2.0F, 3.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition shoulderright = partdefinition.addOrReplaceChild("shoulderright",
				CubeListBuilder.create().texOffs(25, 33)
						.addBox(-7.0F, -2.4F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-7.0F, -1.4F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 18.7F, 0.0F, 0.0873F, 0.0F, 0.2618F));

		PartDefinition shoulderleft = partdefinition.addOrReplaceChild("shoulderleft",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-7.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 10)
						.addBox(-7.0F, -1.0F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, 15.6F, 0.0F, 0.0873F, 0.0F, -0.2618F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-1.0F, -7.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(1, 48)
						.addBox(0.45F, -7.0F, -2.1F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(45, 14)
						.addBox(0.45F, -0.9F, -2.0F, 1.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 15)
						.addBox(0.45F, -2.0F, -2.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(54, 15)
						.addBox(-0.55F, -4.0F, -2.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(54, 14)
						.addBox(1.45F, -5.0F, -2.1F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 58)
						.addBox(-0.55F, -5.0F, -2.1F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 58)
						.addBox(-0.55F, -3.0F, -2.1F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(0.45F, -7.0F, 2.1F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(0.45F, -3.0F, 2.1F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 58)
						.addBox(-0.55F, -5.0F, 2.1F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 58)
						.addBox(-0.55F, -3.0F, 2.1F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(54, 14)
						.addBox(1.45F, -5.0F, 2.1F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(54, 15)
						.addBox(-0.55F, -4.0F, 2.1F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 23.0F, 0.0F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot",
				CubeListBuilder.create().texOffs(48, 59)
						.addBox(-8.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(29, 17)
						.addBox(-8.0F, -1.0F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 24.0F, 0.0F));

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot",
				CubeListBuilder.create().texOffs(48, 59)
						.addBox(-5.0F, -2.0F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-5.0F, -1.0F, -3.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition lefthand = partdefinition.addOrReplaceChild("lefthand", CubeListBuilder.create(),
				PartPose.offset(8.5F, 16.6F, 0.0F));

		PartDefinition cube_r7 = lefthand
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(16, 14).addBox(-14.0F, 4.0F, -3.0F, 4.0F, 3.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r8 = lefthand.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(17, 2)
						.addBox(-6.75F, 0.0F, -3.0F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(35, 6)
						.addBox(-6.5F, -1.0F, -2.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition righthand = partdefinition
				.addOrReplaceChild("righthand",
						CubeListBuilder.create().texOffs(22, 10).addBox(-6.0F, -1.55F, -2.0F, 3.0F, 1.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 19.6F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition knight = righthand.addOrReplaceChild("knight",
				CubeListBuilder.create().texOffs(56, 35)
						.addBox(-6.0F, -6.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 50)
						.addBox(-5.0F, -6.0F, -10.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 26)
						.addBox(-5.0F, -6.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.2F, -2.0F, 3.0F, 0.0998F, -0.648F, -1.7352F));

		PartDefinition everything = partdefinition.addOrReplaceChild("everything", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = everything.addOrReplaceChild("head", CubeListBuilder.create().texOffs(25, 25).addBox(
				-1.0F, -4.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -8.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		dwholemask.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shoulderright.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shoulderleft.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		lefthand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		righthand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		everything.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}