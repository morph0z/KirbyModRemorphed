// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMaceKnight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "maceknight"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public ModelMaceKnight(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -16.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(44, 33)
						.addBox(-5.0F, -9.0F, -6.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-1.0F, -9.5F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 22)
						.addBox(-5.0F, -10.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 20)
						.addBox(3.0F, -10.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 4)
						.addBox(4.0F, -11.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 48)
						.addBox(-5.0F, -11.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 63)
						.addBox(-6.0F, -17.0F, -6.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 63)
						.addBox(5.0F, -17.0F, -6.0F, 1.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(106, 67)
						.addBox(5.0F, -11.0F, -4.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(100, 77)
						.addBox(-5.0F, -11.0F, 5.0F, 10.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(106, 63)
						.addBox(-6.0F, -11.0F, -4.0F, 1.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-5.0F, -16.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 30)
						.addBox(-5.0F, -17.0F, -6.0F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-1.0F, -16.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(3.0F, -16.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(4.0F, -15.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 38)
						.addBox(-0.5F, -15.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 48)
						.addBox(-5.0F, -15.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 42)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(45, 57).addBox(1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(58, 58).addBox(-5.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(24, 99)
						.addBox(-3.0F, -16.0F, -2.75F, 6.0F, 10.0F, 10.5F, new CubeDeformation(0.0F)).texOffs(-1, 97)
						.addBox(-2.0F, -19.0F, -1.75F, 4.0F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(39, 94)
						.addBox(-1.25F, -20.0F, -1.0F, 2.5F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(114, -1)
						.addBox(-0.5F, -20.75F, -0.25F, 1.0F, 0.75F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(52, 80)
						.addBox(-4.5F, -15.0F, -2.75F, 6.0F, 10.0F, 10.5F, new CubeDeformation(0.0F)).texOffs(102, -1)
						.addBox(-3.5F, -18.0F, -1.75F, 4.0F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(86, 46)
						.addBox(-2.75F, -19.0F, -1.0F, 2.5F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(85, 4)
						.addBox(-2.0F, -19.75F, -0.25F, 1.0F, 0.75F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(79, 55)
						.addBox(1.0F, -19.75F, -0.25F, 1.0F, 0.75F, 5.5F, new CubeDeformation(0.0F)).texOffs(15, 106)
						.addBox(0.25F, -19.0F, -1.0F, 2.5F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(104, 1)
						.addBox(-0.5F, -18.0F, -1.75F, 4.0F, 3.0F, 8.5F, new CubeDeformation(0.0F)).texOffs(1, 86)
						.addBox(-1.5F, -15.0F, -2.75F, 6.0F, 10.0F, 10.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(62, 18)
						.addBox(-4.0F, -10.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 61)
						.addBox(-3.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(54, 37)
						.addBox(-1.0F, -10.0F, -2.0F, 5.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 61)
						.addBox(-1.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(45, 0)
						.addBox(-11.0F, -5.0F, -1.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-11.0F, -5.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-11.0F, -2.0F, -8.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-11.0F, -4.75F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 7)
						.addBox(-13.0F, -6.75F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 20)
						.addBox(-11.0F, -6.75F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 22)
						.addBox(-11.0F, -8.75F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 24)
						.addBox(-9.0F, -6.75F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 24)
						.addBox(-11.0F, -4.75F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 25)
						.addBox(-11.0F, -8.75F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-11.0F, -6.75F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 26)
						.addBox(-9.0F, -6.75F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 26)
						.addBox(-13.0F, -6.75F, -12.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 27)
						.addBox(-11.0F, -3.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-13.0F, -3.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 28)
						.addBox(-11.0F, -3.75F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 28)
						.addBox(-9.0F, -3.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-11.0F, -3.75F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 2)
						.addBox(-11.0F, -9.75F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 40)
						.addBox(-11.0F, -9.75F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 40)
						.addBox(-13.0F, -9.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 40)
						.addBox(-11.0F, -9.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 40)
						.addBox(-14.0F, -8.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-14.0F, -6.75F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 42)
						.addBox(-14.0F, -6.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 42)
						.addBox(-14.0F, -4.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 44)
						.addBox(-14.0F, -6.75F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 44)
						.addBox(-9.0F, -9.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 44)
						.addBox(-8.0F, -4.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 37)
						.addBox(-8.0F, -8.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(-8.0F, -6.75F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 46)
						.addBox(-8.0F, -6.75F, -11.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 46)
						.addBox(-8.0F, -6.75F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-13.0F, -8.75F, -11.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}