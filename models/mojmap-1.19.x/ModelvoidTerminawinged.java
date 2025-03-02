// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelvoidTerminawinged<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "voidterminawinged"), "main");
	private final ModelPart rightwing;
	private final ModelPart leftwing;
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart waist;
	private final ModelPart structure;

	public ModelvoidTerminawinged(ModelPart root) {
		this.rightwing = root.getChild("rightwing");
		this.leftwing = root.getChild("leftwing");
		this.head = root.getChild("head");
		this.torso = root.getChild("torso");
		this.waist = root.getChild("waist");
		this.structure = root.getChild("structure");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightwing = partdefinition.addOrReplaceChild("rightwing", CubeListBuilder.create(),
				PartPose.offset(-13.0F, -2.0F, -26.0F));

		PartDefinition cube_r1 = rightwing.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 95)
						.addBox(-101.0F, -38.0F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 166)
						.addBox(-93.0F, -40.3F, 1.8F, 8.0F, 7.4F, 6.4F, new CubeDeformation(0.0F)).texOffs(0, 243)
						.addBox(-101.0F, -35.0F, 4.0F, 36.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(2, 91)
						.addBox(-85.0F, -40.0F, 2.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(178, 114)
						.addBox(-77.0F, -41.0F, 1.0F, 13.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(62.0F, 26.0F, 26.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition leftwing = partdefinition.addOrReplaceChild("leftwing", CubeListBuilder.create(),
				PartPose.offset(13.0F, -2.0F, -26.0F));

		PartDefinition cube_r2 = leftwing.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 166)
						.addBox(-15.0F, -40.3F, 1.8F, 8.0F, 7.4F, 6.4F, new CubeDeformation(0.0F)).texOffs(0, 195)
						.addBox(-35.0F, -35.0F, 4.0F, 36.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 95)
						.addBox(-7.0F, -38.0F, 4.0F, 8.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(2, 91)
						.addBox(-23.0F, -40.0F, 2.0F, 8.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(-34.0F, -41.0F, 1.0F, 11.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(36.0F, 26.0F, 26.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(126, 87)
						.addBox(-6.0F, -24.0F, 38.4F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(68, 127)
						.addBox(2.0F, -24.0F, 38.4F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(109, 141)
						.addBox(-6.0F, -48.0F, -0.6F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(141, 141)
						.addBox(2.0F, -48.0F, -0.6F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(100, 0)
						.addBox(1.0F, -49.0F, -9.6F, 6.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 106)
						.addBox(-7.0F, -49.0F, -9.6F, 6.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(58, 107)
						.addBox(-7.0F, -44.0F, 16.4F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(108, 57)
						.addBox(1.0F, -44.0F, 16.4F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition mask = head.addOrReplaceChild("mask",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-1.0F, -48.0F, 3.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 144)
						.addBox(1.0F, -49.0F, 3.4F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 38)
						.addBox(2.0F, -50.0F, 3.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 144)
						.addBox(-8.0F, -49.0F, 3.4F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 127)
						.addBox(-7.0F, -50.0F, 3.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 44)
						.addBox(-7.0F, -41.0F, 3.4F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 65)
						.addBox(-5.0F, -39.0F, 3.4F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 95)
						.addBox(-3.0F, -38.0F, 3.4F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 32)
						.addBox(-1.0F, -36.0F, 3.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 52)
						.addBox(-2.0F, -37.0F, 3.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(100, 41)
						.addBox(-8.0F, -42.0F, 4.7F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -43.0F, 5.0F, 16.0F, 27.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 122)
						.addBox(-8.0F, -41.0F, 4.2F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(122, 81)
						.addBox(-8.0F, -41.0F, 4.0F, 16.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r6 = torso.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(20, 145)
						.addBox(7.5F, -31.0F, 5.0F, 6.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 3)
						.addBox(9.0F, -34.0F, 5.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 86)
						.addBox(7.0F, -42.0F, 6.0F, 7.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(4.0F, -41.0F, 7.0F, 11.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r7 = torso.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(82, 25).addBox(-13.5F, -39.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.218F, 0.2748F, 0.6848F));

		PartDefinition cube_r8 = torso.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 89).addBox(31.0F, -21.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2519F, 0.2443F, -0.8165F));

		PartDefinition cube_r9 = torso.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(127, 142)
						.addBox(-13.5F, -31.0F, 5.4F, 6.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-12.0F, -34.0F, 5.4F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(76, 44)
						.addBox(-14.0F, -42.0F, 6.0F, 7.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 78)
						.addBox(-15.0F, -41.0F, 7.0F, 11.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r10 = torso.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-33.0F, -21.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2519F, -0.2443F, 0.8165F));

		PartDefinition cube_r11 = torso.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(36, 77).addBox(8.0F, -39.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1931F, -0.2926F, -0.5958F));

		PartDefinition cube_r12 = torso
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(92, 17).addBox(-7.0F, -35.0F, 5.0F, 6.0F, 16.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r13 = torso
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(30, 98).addBox(1.0F, -35.0F, 5.0F, 6.0F, 16.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition waist = partdefinition.addOrReplaceChild("waist",
				CubeListBuilder.create().texOffs(142, 27)
						.addBox(-4.0F, -19.0F, 4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(-3.0F, -20.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(242, 251)
						.addBox(-3.0F, -13.0F, 4.25F, 6.0F, 4.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-2.0F, -9.0F, 4.25F, 4.0F, 1.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-3.0F, -9.0F, 5.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(240, 142)
						.addBox(1.0F, -15.0F, 8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(117, 226)
						.addBox(-6.0F, -13.0F, 8.0F, 13.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(35, 190)
						.addBox(-5.0F, -11.0F, 8.0F, 11.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(171, 3)
						.addBox(-4.0F, -10.0F, 8.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(238, 153)
						.addBox(-3.0F, -9.0F, 8.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(166, 82)
						.addBox(-2.0F, -8.0F, 8.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(214, 87)
						.addBox(-1.0F, -7.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(246, 52)
						.addBox(1.0F, 2.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 236)
						.addBox(-2.0F, 5.0F, 8.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(138, 253)
						.addBox(-1.0F, 6.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(181, 82)
						.addBox(0.0F, 7.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(250, 230)
						.addBox(1.0F, 9.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(173, 49)
						.addBox(-1.0F, 9.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(192, 253)
						.addBox(-1.0F, 10.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(97, 252)
						.addBox(0.0F, 11.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(246, 160)
						.addBox(-3.0F, 2.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(238, 87)
						.addBox(-3.0F, 3.0F, 8.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(246, 52)
						.addBox(1.0F, -5.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(246, 160)
						.addBox(-3.0F, -5.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(238, 87)
						.addBox(-3.0F, -4.0F, 8.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 236)
						.addBox(-2.0F, -2.0F, 8.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(138, 253)
						.addBox(-1.0F, -1.0F, 8.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(181, 82)
						.addBox(0.0F, 0.0F, 8.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(176, 182)
						.addBox(-6.0F, -15.0F, 8.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r14 = waist.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(110, 53)
						.addBox(4.0F, -19.3F, 3.8F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 95)
						.addBox(9.0F, -19.3F, 4.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r15 = waist.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(101, 0)
						.addBox(-10.0F, -19.3F, 4.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(50, 102)
						.addBox(-10.0F, -19.3F, 3.8F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition structure = partdefinition.addOrReplaceChild("structure", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		structure.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightwing.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
		this.leftwing.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}