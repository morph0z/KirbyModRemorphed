// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhynessphase1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hynessphase1"), "main");
	private final ModelPart bb_main;

	public Modelhynessphase1(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(108, 120)
						.addBox(-5.0F, -28.0F, -4.0F, 10.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(110, 119)
						.addBox(-4.5F, -30.0F, -4.0F, 9.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(113, 122)
						.addBox(-3.75F, -32.0F, -4.0F, 7.35F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(115, 124)
						.addBox(-3.15F, -34.0F, -4.0F, 6.2F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(118, 126)
						.addBox(-2.25F, -36.0F, -4.0F, 4.6F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(122, 126)
						.addBox(-2.0F, -36.75F, -4.0F, 1.75F, 0.75F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 20)
						.addBox(-4.0F, -15.0F, -7.0F, 8.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(52, 20)
						.addBox(-5.0F, -20.0F, -7.0F, 10.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 33)
						.addBox(-5.0F, -20.0F, -5.0F, 10.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(46, 63).addBox(7.5F, -19.4F, -5.0F, 1.0F, 20.4F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(48, 63)
						.addBox(-7.5F, -20.0F, -5.0F, 1.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(21, 0)
						.addBox(-10.0F, -20.0F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(45, 38)
						.addBox(-10.0F, -13.0F, -4.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 52)
						.addBox(-9.75F, -13.0F, -3.75F, 3.75F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(38, 63)
						.addBox(-9.75F, -13.0F, 2.5F, 3.75F, 18.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(27, 94)
						.addBox(-6.0F, -13.0F, -3.75F, 0.0F, 18.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(12, 46)
						.addBox(-9.75F, -13.0F, -3.75F, 0.0F, 18.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(82, 79)
						.addBox(-10.0F, -20.0F, -4.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(66, 44)
						.addBox(-10.0F, -20.0F, 3.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 45)
						.addBox(-6.0F, -20.0F, -4.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(85, 48)
						.addBox(-10.0F, -20.0F, -4.0F, 0.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-5.0F, -20.0F, -5.0F, 0.0F, 20.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(50, 63)
						.addBox(-12.5F, -29.0F, -5.0F, 1.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 9)
						.addBox(-12.5F, -29.0F, -5.0F, 4.5F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(34, 9)
						.addBox(-8.5F, -17.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(30, 7)
						.addBox(-12.5F, -17.0F, 3.0F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 18)
						.addBox(-12.5F, -16.0F, 3.0F, 5.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 31)
						.addBox(-12.5F, -29.0F, 5.0F, 4.5F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-12.5F, -29.0F, -5.0F, 4.5F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(20, 2)
						.addBox(-12.5F, -29.0F, -5.0F, 0.0F, 12.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(36, 0)
						.addBox(11.5F, -27.4F, -5.0F, 1.0F, 10.4F, 0.0F, new CubeDeformation(0.0F)).texOffs(18, 7)
						.addBox(4.5F, -17.0F, 3.0F, 8.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 66)
						.addBox(4.5F, -22.4F, 5.0F, 3.0F, 5.4F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.5F, -27.4F, 5.0F, 5.0F, 10.4F, 0.0F, new CubeDeformation(0.0F)).texOffs(20, 12)
						.addBox(12.5F, -27.4F, -5.0F, 0.0F, 10.4F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
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

		PartDefinition cube_r7 = bb_main
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(40, 0).addBox(-5.0F, -20.0F, 5.0F, 10.0F, 20.0F, 0.0F,
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