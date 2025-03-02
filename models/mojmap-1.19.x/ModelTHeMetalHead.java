// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTHeMetalHead<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "themetalhead"), "main");
	private final ModelPart Head;

	public ModelTHeMetalHead(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)).texOffs(7, 32)
						.addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 57)
						.addBox(-5.0F, -8.0F, 4.0F, 10.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(4.0F, -8.0F, -5.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(40, 10)
						.addBox(5.0F, -7.0F, -5.0F, 0.5F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(15, 16)
						.addBox(-5.5F, -7.0F, -5.0F, 0.5F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-4.0F, -6.0F, -4.5F, 8.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(54, 33)
						.addBox(-1.0F, -3.0F, -4.5F, 2.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(48, 32)
						.addBox(-4.0F, -6.5F, -4.5F, 8.0F, 0.5F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 45)
						.addBox(-4.0F, -3.0F, -4.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(58, 43)
						.addBox(1.0F, -3.0F, -4.5F, 3.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(1, 1)
						.addBox(-1.0F, -8.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-3, 16)
						.addBox(-1.0F, -10.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(1.0F, -8.0F, -5.0F, 3.0F, 1.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-4.0F, -8.0F, -5.0F, 3.0F, 1.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(-5.0F, -8.0F, -5.0F, 1.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(9, 30).addBox(19.0F, -27.05F, -0.1F, 2.0F, 1.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, 24.3F, 0.1F, -0.0278F, 0.2963F, -0.6621F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(9, 30).addBox(-35.35F, -2.0F, -0.5F, 2.0F, 0.5F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8F, 24.3F, 0.1F, 0.2796F, -0.1363F, 1.5145F));

		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(9, 30).addBox(-34.65F, 5.8F, 0.5F, 2.0F, 0.5F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, -0.2223F, -0.1395F, 1.6737F));

		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(9, 30).addBox(-23.0F, -25.25F, 0.5F, 2.0F, 1.0F, 0.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, -0.2618F, 0.6545F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}