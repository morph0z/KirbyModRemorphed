// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelKracko<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "kracko"), "main");
	private final ModelPart bb_main;

	public ModelKracko(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(40, 14)
						.addBox(-6.0F, -13.0F, -6.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 50)
						.addBox(0.0F, -13.0F, -6.75F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-10.0F, -19.0F, -6.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 38)
						.addBox(4.0F, -19.0F, -6.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(0.0F, -25.0F, -6.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-6.0F, -24.0F, -6.75F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 32)
						.addBox(-10.0F, -19.0F, -0.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 44)
						.addBox(-6.0F, -24.0F, -0.75F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(0.0F, -25.0F, -0.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
						.addBox(4.0F, -19.0F, -0.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(0.0F, -13.0F, -0.75F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 8)
						.addBox(-6.0F, -13.0F, -0.75F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-4.0F, -19.0F, -0.75F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -20.0F, -7.75F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(36, 0).addBox(12.0F, -6.2F, -1.5F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.0F, 0.0F, 2.4435F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(54, 50).addBox(3.0F, -8.9F, -1.5F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.0F, 0.0F, 3.0543F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(58, 0).addBox(-5.0F, -8.2F, -1.5F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.0F, 0.0F, -2.8798F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(28, 0).addBox(-14.0F, -5.2F, -1.5F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -32.0F, 0.0F, 0.0F, 0.0F, -2.2689F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(54, 37)
						.addBox(-17.0F, -13.2F, -1.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 55)
						.addBox(-17.0F, 7.8F, -1.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r6 = bb_main
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(58, 12).addBox(-13.0F, -5.2F, -1.5F, 2.0F, 5.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r7 = bb_main
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(58, 26).addBox(11.0F, -4.2F, -1.5F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r8 = bb_main
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(58, 59).addBox(3.0F, -8.2F, -1.5F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r9 = bb_main
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(30, 60).addBox(-5.0F, -7.2F, -1.5F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

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