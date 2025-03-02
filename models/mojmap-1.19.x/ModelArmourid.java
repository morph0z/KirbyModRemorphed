// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelArmourid<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "armourid"), "main");
	private final ModelPart bone;

	public ModelArmourid(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(48, 6)
						.addBox(3.5F, -12.0F, -13.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 29)
						.addBox(3.5F, -14.0F, -13.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -12.5F, -13.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(5.0F, -12.5F, -13.2F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 29)
						.addBox(6.5F, -12.0F, -13.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-4.5F, -12.0F, -13.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(49, 12)
						.addBox(-7.5F, -12.0F, -13.5F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 0)
						.addBox(-7.5F, -14.0F, -13.5F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 17)
						.addBox(-7.0F, -13.0F, -13.0F, 3.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(4.0F, -13.0F, -13.0F, 3.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(22, 46)
						.addBox(4.0F, -9.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(38, 16)
						.addBox(4.0F, -10.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 41)
						.addBox(6.0F, -9.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 11)
						.addBox(4.0F, -8.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(29, 46)
						.addBox(5.0F, -9.0F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1687F, 0.045F, -0.258F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(41, 47)
						.addBox(-7.0F, -9.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 47)
						.addBox(-6.0F, -9.0F, -3.7F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 44)
						.addBox(-7.0F, -10.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 46)
						.addBox(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-7.0F, -8.0F, -4.0F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1687F, 0.045F, 0.258F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -15.0F, -4.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-4.0F, -17.0F, -3.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(38, 22)
						.addBox(-2.0F, -2.0F, -1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 33)
						.addBox(-3.0F, -9.0F, -2.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(30, 0).addBox(-12.0F, -1.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8727F));

		PartDefinition cube_r6 = bone
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(36, 8).addBox(0.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}