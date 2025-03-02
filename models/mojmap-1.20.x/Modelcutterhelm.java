// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcutterhelm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "cutterhelm"), "main");
	private final ModelPart Head;

	public Modelcutterhelm(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(42, 0)
						.addBox(-5.0F, -10.0F, -5.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(22, 17)
						.addBox(-4.0F, -10.0F, -5.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 17)
						.addBox(-4.0F, -10.0F, 4.0F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(4.0F, -10.0F, -5.0F, 1.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -11.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(0.0F, -13.0F, -5.0F, 0.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(0.0F, -13.0F, 4.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(0.0F, -8.0F, 6.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -9.0F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
						.addBox(0.0F, -14.0F, -5.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(0.0F, -13.0F, -6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 12)
						.addBox(-4.0F, -7.0F, -8.0F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(51, 20)
						.addBox(-5.0F, -7.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 1)
						.addBox(4.0F, -7.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1",
				CubeListBuilder.create().texOffs(4, 6)
						.addBox(5.0F, -31.25F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 9)
						.addBox(6.0F, -29.25F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(5.0F, -29.25F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 9)
						.addBox(-7.0F, -29.25F, 11.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(-6.0F, -29.25F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 6)
						.addBox(-6.0F, -31.25F, 13.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -31.25F, 10.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(5.0F, -31.25F, 10.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}