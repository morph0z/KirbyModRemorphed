// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnewmetaknight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "newmetaknight"), "main");
	private final ModelPart right;
	private final ModelPart left;
	private final ModelPart bb_main;

	public Modelnewmetaknight(ModelPart root) {
		this.right = root.getChild("right");
		this.left = root.getChild("left");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = right.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 57)
						.addBox(17.0F, -8.0F, 5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 60)
						.addBox(4.0F, -2.0F, 5.0F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 57)
						.addBox(4.0F, -8.0F, 5.0F, 13.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = left.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(32, 57)
						.addBox(-18.0F, -8.0F, 5.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 60)
						.addBox(-17.0F, -2.0F, 5.0F, 13.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 57)
						.addBox(-17.0F, -8.0F, 5.0F, 13.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-5.0F, -11.0F, -6.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-5.0F, -4.0F, -6.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-5.0F, -9.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(4.0F, -9.0F, -6.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 56)
						.addBox(-2.0F, -10.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(25, 28)
						.addBox(-1.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 34)
						.addBox(-4.0F, -10.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-3.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(56, 0).addBox(2.5F, -8.5F, -6.3F, 5.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.0F, -0.0436F, -0.3927F));

		PartDefinition cube_r6 = bb_main
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(56, 0).addBox(-8.0F, -8.4F, -6.0F, 5.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(56, 0).addBox(2.3F, -8.6F, -6.3F, 5.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, -0.3927F));

		PartDefinition cube_r8 = bb_main
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(56, 0).addBox(-8.0F, -8.4F, -6.0F, 5.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r9 = bb_main
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(16, 20).addBox(-5.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r10 = bb_main
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(11, 26).addBox(1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.right.yRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
	}
}