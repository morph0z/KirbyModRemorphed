// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmastercrown<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "mastercrown"), "main");
	private final ModelPart Head;

	public Modelmastercrown(ModelPart root) {
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(12, 0)
				.addBox(-4.0F, -11.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
				.addBox(-1.5F, -13.0F, -6.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 4)
				.addBox(-3.0F, -14.0F, -5.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.0F, -15.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-0.5F, -16.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
				.addBox(-4.0F, -11.0F, 4.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 29)
				.addBox(-4.0F, -13.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
				.addBox(-1.0F, -12.0F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 30)
				.addBox(-3.0F, -14.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-5.0F, -11.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(28, 30).mirror()
				.addBox(2.0F, -14.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(24, 29)
				.mirror().addBox(1.0F, -13.0F, 4.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 0).mirror().addBox(4.0F, -11.0F, -5.0F, 1.0F, 3.0F, 10.0F, new CubeDeformation(0.0F))
				.mirror(false), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(6, 13).mirror()
				.addBox(12.75F, -28.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 29)
				.mirror().addBox(12.75F, -26.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2",
				CubeListBuilder.create().texOffs(0, 13).mirror()
						.addBox(-24.5F, -27.0F, -4.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 0.0F, 0.9163F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3",
				CubeListBuilder.create().texOffs(26, 27).mirror()
						.addBox(-5.0F, -36.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4",
				CubeListBuilder.create().texOffs(26, 27).addBox(4.0F, -36.0F, 0.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5",
				CubeListBuilder.create().texOffs(0, 13).addBox(23.5F, -27.0F, -4.0F, 1.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 23.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition Head_r6 = Head.addOrReplaceChild("Head_r6",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-13.75F, -26.0F, -2.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 13)
						.addBox(-13.75F, -28.0F, -3.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Head_r7 = Head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(12, 13).mirror()
				.addBox(5.0F, -23.0F, -20.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(5, 17)
				.mirror().addBox(5.5F, -20.0F, -20.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, -0.5603F, -0.0934F, -0.1476F));

		PartDefinition Head_r8 = Head.addOrReplaceChild("Head_r8",
				CubeListBuilder.create().texOffs(5, 17)
						.addBox(-6.5F, -20.0F, -20.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 13)
						.addBox(-7.0F, -23.0F, -20.75F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 22.0F, 0.0F, -0.5603F, 0.0934F, 0.1476F));

		return LayerDefinition.create(meshdefinition, 32, 32);
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