// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbutterfly<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "butterfly"), "main");
	private final ModelPart body;
	private final ModelPart wing1;
	private final ModelPart wing2;

	public Modelbutterfly(ModelPart root) {
		this.body = root.getChild("body");
		this.wing1 = root.getChild("wing1");
		this.wing2 = root.getChild("wing2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-0.5F, -2.0F, -3.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition wing1 = partdefinition.addOrReplaceChild("wing1",
				CubeListBuilder.create().texOffs(8, 0)
						.addBox(0.5F, -2.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.5F, -2.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 3)
						.addBox(0.5F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition wing2 = partdefinition.addOrReplaceChild("wing2",
				CubeListBuilder.create().texOffs(0, 7)
						.addBox(-2.5F, -1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-2.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 8)
						.addBox(-2.5F, -1.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wing2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.wing1.zRot = (EndMathProcedure.sin(ageInTicks * 0.6F + 3) * 0.6F);
		this.wing2.zRot = (EndMathProcedure.sin(ageInTicks * 0.6F) * 0.6F);
	}
}