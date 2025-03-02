// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelnewkirby<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "newkirby"), "main");
	private final ModelPart bone;
	private final ModelPart rightfoot;
	private final ModelPart leftfoot;
	private final ModelPart leftNub;
	private final ModelPart rightNub;

	public Modelnewkirby(ModelPart root) {
		this.bone = root.getChild("bone");
		this.rightfoot = root.getChild("rightfoot");
		this.leftfoot = root.getChild("leftfoot");
		this.leftNub = root.getChild("leftNub");
		this.rightNub = root.getChild("rightNub");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = rightfoot
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 20).addBox(1.0F, -1.0F, -8.0F, 4.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r2 = leftfoot
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(20, 20).addBox(-5.0F, -1.0F, -8.0F, 4.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition leftNub = partdefinition.addOrReplaceChild("leftNub", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r3 = leftNub
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 27).addBox(-3.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6545F));

		PartDefinition rightNub = partdefinition.addOrReplaceChild("rightNub", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r4 = rightNub
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(16, 27).addBox(-1.0F, -9.0F, -2.0F, 4.0F, 4.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6545F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftNub.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightNub.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}