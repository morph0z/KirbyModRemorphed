// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhynessphase2<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hynessphase2"), "main");
	private final ModelPart bb_main;

	public Modelhynessphase2(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(88, 13)
						.addBox(-5.0F, -36.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(9, 44)
						.addBox(1.0F, -34.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 44)
						.addBox(-4.0F, -34.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(120, 13)
						.addBox(10.0F, -38.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 10)
						.addBox(9.0F, -37.0F, -3.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 17)
						.addBox(-12.0F, -38.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(72, 31)
						.addBox(-13.0F, -37.0F, -3.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r3 = bb_main
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(94, 33).addBox(-2.0F, -19.0F, -30.0F, 4.0F, 8.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bb_main
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(94, 33).addBox(-2.0F, -30.0F, -12.0F, 4.0F, 8.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(13, 0)
						.addBox(6.25F, -20.0F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(45, 31)
						.addBox(6.25F, -13.0F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(40, 14)
						.addBox(10.0F, -13.0F, -3.75F, 0.0F, 18.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(40, 32)
						.addBox(6.25F, -13.0F, -3.75F, 0.0F, 18.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(52, 52)
						.addBox(6.25F, -13.0F, -3.75F, 3.75F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(6.25F, -13.0F, 2.5F, 3.75F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 88)
						.addBox(6.25F, -20.0F, 3.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(68, 0)
						.addBox(6.25F, -20.0F, -4.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(93, 67)
						.addBox(10.25F, -20.0F, -4.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(52, 38)
						.addBox(6.0F, -20.0F, -4.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, -20.0F, -5.0F, 0.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(21, 0)
						.addBox(-10.0F, -20.0F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(45, 38)
						.addBox(-10.0F, -13.0F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 52)
						.addBox(-9.75F, -13.0F, -3.75F, 3.75F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 63)
						.addBox(-9.75F, -13.0F, 2.5F, 3.75F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 94)
						.addBox(-6.0F, -13.0F, -3.75F, 0.0F, 18.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(12, 46)
						.addBox(-9.75F, -13.0F, -3.75F, 0.0F, 18.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(82, 79)
						.addBox(-10.0F, -20.0F, -4.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(66, 44)
						.addBox(-10.0F, -20.0F, 3.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 45)
						.addBox(-6.0F, -20.0F, -4.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(85, 48)
						.addBox(-10.0F, -20.0F, -4.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(1, 7)
						.addBox(-5.0F, -20.0F, -5.0F, 0.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(20, 32).addBox(-5.0F, -20.0F, -5.0F, 10.0F, 20.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bb_main
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(1, 17).addBox(-5.0F, -20.0F, 5.0F, 10.0F, 20.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

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