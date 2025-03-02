// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcupie<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cupie"), "main");
	private final ModelPart bow;
	private final ModelPart body;
	private final ModelPart rightWing;
	private final ModelPart leftWing;
	private final ModelPart bb_main;

	public Modelcupie(ModelPart root) {
		this.bow = root.getChild("bow");
		this.body = root.getChild("body");
		this.rightWing = root.getChild("rightWing");
		this.leftWing = root.getChild("leftWing");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bow = partdefinition.addOrReplaceChild("bow", CubeListBuilder.create().texOffs(45, 28)
				.addBox(9.0F, -16.9F, -11.6F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-4.0F, 24.0F, -2.0F));

		PartDefinition cube_r1 = bow.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(11, 33).addBox(7.0F, -8.3F, -25.9F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bow.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 5).addBox(7.0F, -8.3F, -25.9F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, -31.0F, -1.0F, -1.0472F, 0.0F, -3.1416F));

		PartDefinition cube_r3 = bow.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(32, 24).addBox(7.0F, -21.0F, -15.8F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, -31.0F, -1.0F, -0.2618F, 0.0F, 3.1416F));

		PartDefinition cube_r4 = bow.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(48, 45).addBox(7.0F, -12.2F, -12.9F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bow
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(50, 35).addBox(7.0F, -21.1F, -7.6F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bow.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(48, 10).addBox(7.0F, -21.0F, -15.8F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(34, 79)
						.addBox(-4.0F, -25.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -23.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r7 = body
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(22, 44).addBox(-7.0F, -18.0F, -7.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.4363F, 0.0F));

		PartDefinition cube_r8 = body
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(45, 20).addBox(7.0F, -17.0F, 6.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(2.0F, 0.0F, -1.0F, 0.0F, 1.8762F, 0.0F));

		PartDefinition cube_r9 = body
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(36, 37).addBox(1.0F, -16.1F, 1.8F, 5.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = body
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(0, 43).addBox(-6.0F, -13.6F, 8.1F, 5.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition rightWing = partdefinition.addOrReplaceChild("rightWing", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r11 = rightWing.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(47, 0)
						.addBox(-2.0F, -18.0F, 11.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 27)
						.addBox(-2.0F, -17.0F, 11.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-2.0F, -21.0F, 11.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.5236F, 0.0F));

		PartDefinition leftWing = partdefinition.addOrReplaceChild("leftWing", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r12 = leftWing.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(38, 45)
						.addBox(0.0F, -18.0F, 11.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(0.0F, -17.0F, 11.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(18, 34)
						.addBox(0.0F, -21.0F, 11.0F, 2.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, -0.5236F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(21, 24)
						.addBox(5.5F, -16.0F, -17.0F, 1.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(18, 44)
						.addBox(5.0F, -26.0F, -8.0F, 2.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(3.5F, 1.7F, -25.4F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(3.5F, 4.7F, -25.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(3.5F, 1.7F, -24.4F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(29, 34)
						.addBox(3.5F, 3.7F, -24.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, 0.0F, 1.0F, -0.8727F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bow.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leftWing.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.rightWing.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
	}
}