// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelheadband<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "headband"), "main");
	private final ModelPart Head;

	public Modelheadband(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -7.0F, -5.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-5.0F, -7.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(48, 5)
						.addBox(3.0F, -7.0F, -3.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 39)
						.addBox(-5.0F, -7.0F, 3.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.5F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 44).addBox(9.0F, -28.0F, 4.0F, 2.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r2 = Head
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 40).addBox(-13.0F, -27.0F, 4.0F, 2.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

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