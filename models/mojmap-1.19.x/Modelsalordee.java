// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsalordee<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "salordee"), "main");
	private final ModelPart bone;

	public Modelsalordee(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 37)
						.addBox(-6.0F, -14.0F, -6.0F, 12.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-7.0F, -17.0F, -7.0F, 14.0F, 3.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(103, 10)
						.addBox(-6.25F, -14.0F, -6.25F, 12.5F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(103, 24)
						.addBox(-6.25F, -14.0F, 6.25F, 12.5F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(99, 41)
						.addBox(6.25F, -14.0F, -6.25F, 0.0F, 2.0F, 12.5F, new CubeDeformation(0.0F)).texOffs(96, 57)
						.addBox(-6.25F, -14.0F, -6.25F, 0.0F, 2.0F, 12.5F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -7.0F, -7.0F, 14.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(44, 25).addBox(-6.0F, -2.0F, -9.0F, 5.0F, 2.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(43, 6).addBox(1.0F, -2.0F, -9.0F, 5.0F, 2.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(48, 43).addBox(1.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.3927F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(43, 53).addBox(-6.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, -0.3927F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(103, 28).addBox(-6.25F, -14.0F, 6.25F, 8.5F, 2.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1148F, -0.8192F, 1.2267F));

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
	}
}