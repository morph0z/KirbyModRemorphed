// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelfffffdddd<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "fffffdddd"), "main");
	private final ModelPart Body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public Modelfffffdddd(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 53).addBox(-21.0F, -11.0F, 6.0F, 16.0F, 10.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -4.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r2 = Body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 53).addBox(5.0F, -11.0F, 6.0F, 16.0F, 10.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -4.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(34, 48)
				.addBox(-4.0F, 6.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition cube_r3 = RightArm.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -25.5F, -3.0F, 5.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(34, 48)
				.addBox(-1.0F, 6.0F, -3.0F, 5.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition cube_r4 = LeftArm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -25.5F, -3.0F, 5.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}