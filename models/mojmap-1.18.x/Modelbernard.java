// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbernard<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bernard"), "main");
	private final ModelPart bone;

	public Modelbernard(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(30, 23)
						.addBox(-5.0F, -14.0F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(9, 49)
						.addBox(-1.0F, -15.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 38)
						.addBox(-2.0F, -16.0F, -6.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 3)
						.addBox(-5.0F, -11.0F, -6.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(37, 0)
						.addBox(-5.0F, -11.0F, 5.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 35)
						.addBox(5.0F, -11.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-6.0F, -11.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(45, 12)
						.addBox(-5.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(37, 6)
						.addBox(1.0F, -1.0F, -7.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(38, 38)
						.addBox(-1.0F, -7.0F, -6.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 33)
						.addBox(-2.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(1.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -9.0F, -7.0F, 12.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(40, 55)
						.addBox(-4.0F, -7.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 38)
						.addBox(-7.0F, -7.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 54)
						.addBox(-5.0F, -7.0F, -7.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 52)
						.addBox(2.0F, -7.0F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(4.0F, -7.0F, -7.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 38)
						.addBox(5.0F, -7.0F, -5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(4.0F, -7.0F, -3.0F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(4.0F, -7.0F, -1.0F, 3.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(4.0F, -7.0F, 1.0F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 49)
						.addBox(4.0F, -7.0F, 3.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 38)
						.addBox(1.0F, -7.0F, 3.0F, 3.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 51)
						.addBox(-2.0F, -7.0F, 3.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(30, 15)
						.addBox(-7.0F, -7.0F, 3.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 48)
						.addBox(-7.0F, -7.0F, 1.0F, 5.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 6)
						.addBox(-7.0F, -7.0F, -1.0F, 5.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 46)
						.addBox(-7.0F, -7.0F, -3.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(8.0F, -7.0F, -3.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 33)
						.addBox(7.0F, -10.0F, -8.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(7.0F, -10.0F, -9.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 23)
						.addBox(7.0F, -7.0F, -9.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 15)
						.addBox(7.0F, -9.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(9, 6)
						.addBox(10.0F, -9.0F, -9.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 47).addBox(8.0F, -9.0F, -7.0F, 2.0F, 2.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(28, 43).addBox(8.0F, -8.0F, 2.0F, 2.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 7).addBox(-7.0F, -3.0F, -10.0F, 3.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r4 = bone
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(0, 15).addBox(-2.0F, -6.0F, 7.5F, 3.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}