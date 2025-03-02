// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelW<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "w"),
			"main");
	private final ModelPart bone;

	public ModelW(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 17)
				.addBox(-2.75F, -3.0F, -8.0F, 5.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 5)
						.addBox(0.25F, -3.0F, -4.25F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.0F, -3.75F, 4.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r3 = bone
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(6, 8).addBox(1.0F, -3.0F, -1.75F, 4.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r4 = bone
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -3.0F, -7.0F, 5.0F, 3.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = bone
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(17, 17).addBox(-3.0F, -3.0F, -1.0F, 5.0F, 3.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r6 = bone
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(20, 0).addBox(-3.0F, -3.0F, -0.5F, 5.0F, 3.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

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