// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeljr_EXPLODE<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "jr_explode"), "main");
	private final ModelPart bone;

	public Modeljr_EXPLODE(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(28, 29)
						.addBox(-5.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-3.0F, -9.0F, 0.0F, 6.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(-1.0F, -6.4F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 13)
						.addBox(-3.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(1.0F, -9.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(5.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(15, 33)
						.addBox(-8.0F, -14.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(-8.0F, -17.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 27)
						.addBox(-7.0F, -16.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -11.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 16)
						.addBox(-1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-4.0F, -17.0F, -2.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -18.0F, -3.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(15, 24)
						.addBox(-1.0F, -3.7F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(19, 27).addBox(-2.0F, -10.5F, -23.0F, 3.0F, 3.0F, 3.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.3963F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(22, 10).addBox(-1.0F, -13.0F, -19.0F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1345F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(27, 34)
						.addBox(-2.0F, -20.5F, -9.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 10)
						.addBox(-3.0F, -18.75F, -10.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(22, 18).addBox(-4.0F, -19.25F, -5.0F, 8.0F, 2.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(28, 5)
						.addBox(-5.0F, 0.0F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 26)
						.addBox(-12.0F, 0.0F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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