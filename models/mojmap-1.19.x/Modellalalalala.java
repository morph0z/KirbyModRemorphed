// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modellalalalala<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "lalalalala"), "main");
	private final ModelPart right;
	private final ModelPart left;
	private final ModelPart bb_main;

	public Modellalalalala(ModelPart root) {
		this.right = root.getChild("right");
		this.left = root.getChild("left");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition right = partdefinition.addOrReplaceChild("right", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = right
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 20).addBox(1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition left = partdefinition.addOrReplaceChild("left", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = left
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(18, 20).addBox(-5.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(48, 0)
						.addBox(1.0F, -13.0F, -7.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-6.0F, -13.0F, -7.0F, 5.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -12.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(30, 0)
						.addBox(0.0F, -8.0F, -1.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 26)
						.addBox(1.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(30, 5)
						.addBox(-1.0F, -8.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(-5.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		right.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}