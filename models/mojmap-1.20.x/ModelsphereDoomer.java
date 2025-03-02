// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelsphereDoomer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "spheredoomer"), "main");
	private final ModelPart leftwing;
	private final ModelPart rightflap;
	private final ModelPart rightwing;
	private final ModelPart leftflap;
	private final ModelPart bb_main;

	public ModelsphereDoomer(ModelPart root) {
		this.leftwing = root.getChild("leftwing");
		this.rightflap = root.getChild("rightflap");
		this.rightwing = root.getChild("rightwing");
		this.leftflap = root.getChild("leftflap");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition leftwing = partdefinition.addOrReplaceChild("leftwing",
				CubeListBuilder.create().texOffs(30, 17)
						.addBox(6.0F, -19.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(6.0F, -17.75F, -0.5F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 31)
						.addBox(6.0F, -13.75F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(28, 31)
						.addBox(9.0F, -13.75F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 31)
						.addBox(12.0F, -13.75F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(10.0F, -14.75F, -0.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = leftwing.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 0)
						.addBox(1.7F, -20.2F, -0.5F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 6)
						.addBox(2.7F, -22.2F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition rightflap = partdefinition.addOrReplaceChild("rightflap", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = rightflap.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 2)
						.addBox(-3.0F, -0.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 7)
						.addBox(-2.0F, -2.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-4.0F, -1.3F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(-4.0F, -2.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-4.0F, -3.3F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 15)
						.addBox(-3.0F, -4.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, -5.3F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 14)
						.addBox(-3.0F, -6.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 30)
						.addBox(-4.0F, -6.7F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 3)
						.addBox(-3.0F, -8.7F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition rightwing = partdefinition.addOrReplaceChild("rightwing",
				CubeListBuilder.create().texOffs(30, 14)
						.addBox(-12.0F, -19.0F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-10.0F, -17.75F, -0.5F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-11.0F, -13.75F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-14.0F, -13.75F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-14.0F, -14.75F, -0.5F, 4.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 31)
						.addBox(-8.0F, -13.75F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = rightwing.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 3)
						.addBox(-8.7F, -20.2F, -0.5F, 7.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 28)
						.addBox(-8.7F, -22.2F, -1.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition leftflap = partdefinition.addOrReplaceChild("leftflap", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r4 = leftflap.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 6)
						.addBox(3.0F, -2.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(2.0F, -0.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 5)
						.addBox(1.0F, -2.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(1.0F, -1.3F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 19)
						.addBox(1.0F, -3.3F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 16)
						.addBox(2.0F, -4.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(1.0F, -6.7F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(2.0F, -6.3F, 3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(1.0F, -5.3F, 3.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -8.7F, 3.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.1F, 4.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-5.0F, -19.0F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -12.0F, -5.0F, 10.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(4, 42)
						.addBox(-5.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-3.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 40)
						.addBox(-1.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 38)
						.addBox(1.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 41)
						.addBox(3.0F, -15.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 36)
						.addBox(4.0F, -13.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 34)
						.addBox(2.0F, -13.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 41)
						.addBox(0.0F, -13.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 29)
						.addBox(-2.0F, -13.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 40)
						.addBox(-4.0F, -13.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 31)
						.addBox(-5.0F, -13.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-5.0F, -15.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 24)
						.addBox(-5.0F, -15.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 22)
						.addBox(-5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 20)
						.addBox(-5.0F, -15.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 11)
						.addBox(-4.0F, -15.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 9)
						.addBox(-2.0F, -15.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 39)
						.addBox(0.0F, -15.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 39)
						.addBox(2.0F, -15.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 37)
						.addBox(4.0F, -15.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 35)
						.addBox(4.0F, -15.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 38)
						.addBox(4.0F, -15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 33)
						.addBox(4.0F, -15.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 28)
						.addBox(4.0F, -15.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 37)
						.addBox(4.0F, -13.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 30)
						.addBox(4.0F, -13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 21)
						.addBox(4.0F, -13.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 36)
						.addBox(4.0F, -13.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 34)
						.addBox(-5.0F, -13.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(35, 32)
						.addBox(-5.0F, -13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 35)
						.addBox(-5.0F, -13.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 20)
						.addBox(-5.0F, -13.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 33)
						.addBox(-3.0F, -13.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 33)
						.addBox(-1.0F, -13.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 33)
						.addBox(1.0F, -13.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 22)
						.addBox(3.0F, -13.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-4.0F, -17.0F, -4.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(4, 33)
						.addBox(-8.0F, -14.75F, -0.5F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -10.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(0.0F, -10.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(6, 20).addBox(4.1F, -17.1F, -10.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -1.0F, -0.6104F, 0.025F, -0.226F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(30, 20).addBox(4.1F, -20.1F, 0.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(5, 0).addBox(-3.0F, -20.6F, 0.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.1745F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		leftwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightflap.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftflap.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leftwing.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.rightwing.xRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
	}
}