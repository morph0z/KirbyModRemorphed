// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelaxeKnight<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "axeknight"), "main");
	private final ModelPart bone;

	public ModelaxeKnight(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(53, 5)
						.addBox(-5.0F, -14.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(14, 34)
						.addBox(-5.0F, -12.0F, -6.25F, 10.0F, 2.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-1.0F, -14.0F, -6.25F, 2.0F, 2.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(30, 26)
						.addBox(2.5F, -13.5F, -5.5F, 1.0F, 1.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(30, 22)
						.addBox(-0.5F, -12.5F, -6.5F, 1.0F, 1.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(6, 28)
						.addBox(-0.5F, -14.5F, -6.5F, 1.0F, 1.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(22, 37)
						.addBox(-0.5F, -14.25F, 5.0F, 1.0F, 1.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(14, 35)
						.addBox(-0.5F, -12.25F, 5.0F, 1.0F, 1.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(30, 24)
						.addBox(-3.5F, -13.5F, -5.5F, 1.0F, 1.0F, 1.25F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.0F, -14.0F, 5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 28)
						.addBox(-1.0F, -15.0F, -6.25F, 2.0F, 1.0F, 12.25F, new CubeDeformation(0.0F)).texOffs(14, 37)
						.addBox(-5.0F, -12.0F, 5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 49)
						.addBox(5.0F, -12.0F, -6.25F, 1.0F, 2.0F, 12.25F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-6.0F, -12.0F, -6.25F, 1.0F, 2.0F, 12.25F, new CubeDeformation(0.0F)).texOffs(40, 40)
						.addBox(-4.0F, -10.0F, -6.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 60)
						.addBox(-4.0F, -5.0F, -6.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 24)
						.addBox(-4.0F, -8.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(115, 17)
						.addBox(3.0F, -8.0F, -6.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-1.0F, -8.0F, -6.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 20)
						.addBox(-3.25F, -3.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(1.25F, -3.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-1.0F, -3.0F, -6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(35, 15).addBox(1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(82, 47).addBox(-5.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(28, 48).addBox(-7.0F, -16.0F, -2.25F, 3.0F, 5.0F, 4.25F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 2.4435F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 48)
						.addBox(10.25F, -14.75F, -2.25F, 3.0F, 5.0F, 4.25F, new CubeDeformation(0.0F)).texOffs(4, 51)
						.addBox(11.25F, -15.75F, -1.25F, 1.0F, 1.0F, 2.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, -2.6616F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(4, 52)
						.addBox(11.25F, -15.75F, -1.25F, 1.0F, 1.0F, 2.25F, new CubeDeformation(0.0F)).texOffs(28, 48)
						.addBox(10.25F, -14.75F, -2.25F, 3.0F, 5.0F, 4.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r6 = bone
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(42, 48).addBox(-7.0F, -16.0F, -2.25F, 3.0F, 5.0F, 4.25F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(43, 0)
						.addBox(-11.5F, -12.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 2)
						.addBox(-11.5F, -11.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-11.5F, -22.0F, 0.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(7, 66)
						.addBox(-11.5F, -21.0F, 0.0F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-11.5F, -20.0F, 0.0F, 6.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(65, 23)
						.addBox(-5.5F, -23.0F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 27)
						.addBox(-5.5F, -22.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 36)
						.addBox(-5.5F, -22.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.5F, -22.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(-5.5F, -21.0F, -0.5F, 1.0F, 17.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r8 = bone
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(28, 71).addBox(-3.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition cube_r9 = bone
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(46, 6).addBox(-1.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}