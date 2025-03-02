// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelFlamberge<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "flamberge"), "main");
	private final ModelPart bb_main;

	public ModelFlamberge(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(56, 20)
						.addBox(-4.6F, -12.5F, -5.0F, 9.2F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(3.6F, -12.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-9.4F, -8.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 4)
						.addBox(-9.4F, -10.5F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 71)
						.addBox(-8.65F, -9.5F, -0.25F, 1.5F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-4.0F, -6.0F, -5.5F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(46, 8)
						.addBox(2.0F, -6.0F, -5.5F, 2.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(32, 26)
						.addBox(-5.0F, -3.0F, -5.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(42, 42)
						.addBox(-5.0F, -5.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(32, 12)
						.addBox(-5.0F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 35)
						.addBox(-4.0F, -5.0F, -5.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 42)
						.addBox(-4.6F, -12.5F, -4.0F, 1.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(42, 54)
						.addBox(-4.6F, -12.5F, 4.0F, 9.2F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(4.0F, -5.0F, -5.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(108, -10)
						.addBox(5.0F, -3.0F, -5.0F, 0.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 32)
						.addBox(-4.0F, -5.0F, 4.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 24)
						.addBox(-5.0F, -3.0F, 5.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 0)
						.addBox(6.6F, -10.5F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 125)
						.addBox(7.35F, -9.5F, -0.25F, 1.5F, 1.0F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.6F, -8.5F, -1.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(111, 60)
						.addBox(-4.0F, -15.5F, -4.5F, 8.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(86, 108)
						.addBox(4.0F, -15.5F, -4.5F, 0.5F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(54, 44)
						.addBox(-4.0F, -15.5F, 4.0F, 8.0F, 3.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(81, 69)
						.addBox(-4.4F, -15.5F, -4.5F, 0.5F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-4.0F, -20.7F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(14, 51).addBox(-2.0F, -0.25F, 19.55F, 1.0F, 0.75F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -1.0F, 2.0F, 0.6453F, -1.4904F, 0.5005F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 29).addBox(-3.0F, -16.0F, 14.1F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -1.0F, 2.0F, -0.0965F, -1.4904F, 0.5005F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(10, 49).addBox(-2.5F, -10.0F, 17.3F, 2.0F, 0.75F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.25F, -1.0F, 2.0F, 0.1653F, -1.4904F, 0.5005F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(4, 50).addBox(-2.0F, 0.25F, 19.3F, 1.0F, 1.5F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, -4.0F, 0.0F, 1.1899F, -1.4889F, -0.3042F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(42, 42).addBox(-2.5F, -10.0F, 17.3F, 2.0F, 1.5F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, -4.0F, 0.0F, 0.71F, -1.4889F, -0.3042F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -16.0F, 14.1F, 3.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, -4.0F, 0.0F, 0.4482F, -1.4889F, -0.3042F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(24, 58)
						.addBox(-6.5F, -20.0F, 6.75F, 1.0F, 0.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(-4.0F, -20.25F, 6.75F, 1.0F, 1.25F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.25F, -1.2F, -2.9561F, 0.075F, 3.1329F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(42, 49)
						.addBox(-7.0F, -21.25F, 5.0F, 2.0F, 0.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 18)
						.addBox(-5.0F, -21.25F, 5.0F, 3.0F, 1.25F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.25F, -1.2F, -3.0434F, 0.075F, 3.1329F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 21).addBox(-3.0F, -21.25F, 6.0F, 3.0F, 2.25F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.25F, -1.2F, -2.9275F, -0.9943F, -3.0313F));

		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(42, 28).addBox(-2.75F, -18.5F, 7.75F, 2.5F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.25F, -1.3F, -2.8403F, -0.9943F, -3.0313F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(58, 38)
						.addBox(-1.75F, -14.5F, 12.0F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 58)
						.addBox(-2.0F, -15.0F, 12.0F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 0.25F, -1.3F, -2.5785F, -0.9943F, -3.0313F));

		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(24, 32)
						.addBox(-4.0F, -16.0F, 14.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 49)
						.addBox(-3.0F, -14.0F, 14.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.6512F, 0.502F, 3.0532F));

		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 24).addBox(-3.0F, -17.95F, 12.0F, 3.0F, 2.25F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.25F, -3.0F, 0.0F, 1.5708F, -0.7854F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(34, 42).addBox(-2.5F, -13.2F, 15.85F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.25F, -3.0F, 0.0F, 1.5708F, -1.0472F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(54, 38).addBox(-2.0F, -4.45F, 18.85F, 1.0F, 1.5F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.5F, 0.25F, -3.0F, 0.0F, 1.5708F, -1.4399F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(20, 58).addBox(-2.0F, -5.95F, 19.35F, 1.0F, 1.5F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -1.0472F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(42, 45).addBox(-2.5F, -13.2F, 15.85F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.6545F));

		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(23, 74).addBox(-3.0F, -17.95F, 12.0F, 3.0F, 1.25F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition cube_r19 = bb_main.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(32, 60)
						.addBox(-1.75F, -14.5F, 12.0F, 0.5F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 58)
						.addBox(-2.0F, -15.0F, 12.0F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.4722F, 0.7816F, 0.0869F));

		PartDefinition cube_r20 = bb_main.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(44, 38).addBox(-2.75F, -18.5F, 7.75F, 2.5F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -0.1F, 0.2104F, 0.7816F, 0.0869F));

		PartDefinition cube_r21 = bb_main.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 29).addBox(-3.0F, -21.25F, 6.0F, 3.0F, 2.25F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1231F, 0.7816F, 0.0869F));

		PartDefinition cube_r22 = bb_main.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 45)
						.addBox(0.0F, -17.0F, 13.1F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 28)
						.addBox(1.0F, -15.0F, 13.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5108F, -0.7383F, -0.0797F));

		PartDefinition cube_r23 = bb_main.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(24, 35).addBox(-3.1F, -21.0F, 5.5F, 3.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.088F, 0.1304F, 0.0115F));

		PartDefinition cube_r24 = bb_main.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(10, 51).addBox(-0.55F, -18.35F, 5.5F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0869F, -0.0076F, 0.1306F));

		PartDefinition cube_r25 = bb_main.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 48).addBox(-0.8F, -19.25F, 5.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.0872F, -0.0038F, 0.0871F));

		PartDefinition cube_r26 = bb_main
				.addOrReplaceChild("cube_r26",
						CubeListBuilder.create().texOffs(0, 18).addBox(-1.0F, -21.0F, 5.5F, 4.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r27 = bb_main.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-5.25F, -28.5F, -5.0F, 11.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(34, 42)
						.addBox(4.75F, -21.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(52, 12)
						.addBox(-4.25F, -21.5F, -5.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 45)
						.addBox(-4.25F, -20.5F, -4.0F, 8.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.25F, -27.5F, -6.0F, 13.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(8, 51)
						.addBox(-5.25F, -21.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(10, 47)
						.addBox(-4.25F, -20.5F, 3.0F, 8.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(54, 55)
						.addBox(4.25F, -20.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(52, 15)
						.addBox(-4.25F, -21.5F, 3.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 58)
						.addBox(-5.25F, -20.5F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r28 = bb_main.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(38, 29)
						.addBox(0.0F, -15.0F, 5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(8, 21)
						.addBox(2.0F, -15.0F, 5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 0)
						.addBox(0.0F, -15.0F, -5.5F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(30, 45)
						.addBox(2.0F, -15.0F, -5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 42)
						.addBox(0.0F, -15.0F, -5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r29 = bb_main.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(32, 30).addBox(4.65F, -3.5F, -5.0F, 1.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r30 = bb_main
				.addOrReplaceChild("cube_r30",
						CubeListBuilder.create().texOffs(44, 20).addBox(-5.6F, -3.5F, -5.0F, 1.0F, 2.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r31 = bb_main.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(20, 49)
						.addBox(-2.0F, -15.0F, -5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 20)
						.addBox(-3.0F, -15.0F, -5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 24)
						.addBox(-3.0F, -15.0F, 5.5F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-2.0F, -15.0F, 5.5F, 2.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 29)
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