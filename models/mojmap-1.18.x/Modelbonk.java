// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbonk<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bonk"), "main");
	private final ModelPart bb_main;

	public Modelbonk(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, -13.0F, -2.0F, 12.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
						.addBox(-5.0F, -16.0F, -3.0F, 10.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(27, 29)
						.addBox(-4.0F, -19.0F, -3.0F, 8.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(13, 39)
						.addBox(-6.0F, -4.0F, -3.0F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 13)
						.addBox(-6.0F, -13.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-6.0F, -10.0F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(5.0F, -10.0F, -3.0F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 43)
						.addBox(-6.0F, -12.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 42)
						.addBox(5.0F, -12.0F, -3.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(23, 18)
						.addBox(-4.0F, -20.0F, 0.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(5, 20)
						.addBox(1.0F, -20.0F, 0.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 2)
						.addBox(2.0F, -21.0F, 0.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(4, 1)
						.addBox(-3.0F, -21.0F, 0.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 20)
						.addBox(-1.0F, -20.0F, 0.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(23, 19)
						.addBox(-1.0F, -21.0F, 0.5F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(3, 0)
						.addBox(-0.5F, -22.0F, 0.5F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 45)
						.addBox(6.0F, -10.0F, -2.0F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 13)
						.addBox(2.0F, -13.0F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(5, 18)
						.addBox(11.25F, -3.75F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(10.25F, -2.75F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 6)
						.addBox(10.25F, -1.75F, -2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 55)
						.addBox(13.25F, -5.75F, -2.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 0)
						.addBox(11.25F, -5.75F, -1.0F, 5.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(16.25F, -5.75F, -1.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, 0.0F, 2.3126F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(42, 50).addBox(6.0F, -10.0F, -1.0F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -18.0F, 0.0F, 0.0F, 0.0F, 2.7053F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 36)
						.addBox(15.0F, 18.0F, -5.0F, 1.0F, 3.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(15.0F, 15.0F, -5.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(9.0F, 15.0F, -5.0F, 6.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0071F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(17.0F, -10.0F, 0.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 51)
						.addBox(16.25F, -5.75F, -1.0F, 2.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 40)
						.addBox(11.25F, -5.75F, -2.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(30, 0).addBox(2.0F, -1.0F, -2.0F, 3.0F, 1.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition cube_r6 = bb_main
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(50, 29).addBox(-5.0F, -1.0F, -2.0F, 3.0F, 1.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, 0.0F, 0.2618F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}