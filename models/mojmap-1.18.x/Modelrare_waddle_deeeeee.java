// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrare_waddle_deeeeee<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "rare_waddle_deeeeee"), "main");
	private final ModelPart bone;

	public Modelrare_waddle_deeeeee(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-6.0F, -16.0F, -6.0F, 12.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(3, 2)
						.addBox(-6.0F, -9.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F,
				-8.0F, -7.0F, 14.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone2
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 38).addBox(-6.0F, -2.0F, -9.0F, 5.0F, 2.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = bone2
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(35, 25).addBox(1.0F, -2.0F, -9.0F, 5.0F, 2.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 40).addBox(1.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.3927F));

		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(42, 0).addBox(-6.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, -0.3927F));

		PartDefinition bone3 = bone2.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(124, 0)
						.addBox(1.0F, -13.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(1.0F, -13.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(6.0F, -13.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-7.0F, -13.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-7.0F, -13.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-7.0F, -7.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-2.0F, -10.0F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(-1.0F, -4.0F, -8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(1.0F, -5.0F, -8.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 126)
						.addBox(-4.0F, -5.0F, -8.0F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(6.0F, -10.0F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-7.0F, -10.0F, -7.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(1.0F, -13.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(1.0F, -7.0F, -7.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(124, 0)
						.addBox(-2.0F, -13.0F, -7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(106, 121)
						.addBox(5.0F, -6.0F, -3.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(85, 37)
						.addBox(4.0F, -16.0F, -4.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -10.0F, -2.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));

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