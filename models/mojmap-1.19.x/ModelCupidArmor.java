// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCupidArmor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cupidarmor"), "main");
	private final ModelPart Head;
	private final ModelPart leftWing;
	private final ModelPart LEftWing2;

	public ModelCupidArmor(ModelPart root) {
		this.Head = root.getChild("Head");
		this.leftWing = root.getChild("leftWing");
		this.LEftWing2 = root.getChild("LEftWing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(20, 21)
						.addBox(-4.0F, -12.0F, 2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-4.0F, -12.0F, -4.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 25)
						.addBox(2.0F, -12.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-4.0F, -12.0F, -2.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition leftWing = partdefinition.addOrReplaceChild("leftWing", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = leftWing.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 17)
						.addBox(1.0F, 2.0F, 1.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(1.0F, 3.0F, 1.0F, 13.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.6521F, -0.6662F, -2.7727F));

		PartDefinition LEftWing2 = partdefinition.addOrReplaceChild("LEftWing2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = LEftWing2.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(0.0F, 3.0F, 1.0F, 13.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(0.0F, 2.0F, 0.0F, 13.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0578F, -0.4621F, -0.3666F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftWing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LEftWing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Head.yRot = ageInTicks;
		this.LEftWing2.xRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
		this.leftWing.xRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
	}
}