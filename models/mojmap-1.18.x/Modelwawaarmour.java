// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelwawaarmour<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "wawaarmour"), "main");
	private final ModelPart crown;

	public Modelwawaarmour(ModelPart root) {
		this.crown = root.getChild("crown");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition crown = partdefinition.addOrReplaceChild("crown",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -9.0F, -4.0F, 10.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(-1.0F, -11.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(-2.0F, -10.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(-1.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(-5.0F, -7.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(3.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(4.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 36)
						.addBox(-5.0F, -8.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -9.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = crown.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -38.25F, -8.25F, 8.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		crown.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.crown.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.crown.xRot = headPitch / (180F / (float) Math.PI);
	}
}