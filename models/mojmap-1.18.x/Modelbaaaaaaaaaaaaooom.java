// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbaaaaaaaaaaaaooom<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "baaaaaaaaaaaaooom"), "main");
	private final ModelPart bb_main;

	public Modelbaaaaaaaaaaaaooom(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -7.0F, -1.0F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 8)
						.addBox(1.0F, -6.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-3.0F, -6.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
						.addBox(-2.0F, -6.0F, -2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-2.0F, -6.0F, 2.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(5, 8).addBox(-3.0F, -8.0F, 0.0F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bb_main.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.bb_main.xRot = headPitch / (180F / (float) Math.PI);
	}
}