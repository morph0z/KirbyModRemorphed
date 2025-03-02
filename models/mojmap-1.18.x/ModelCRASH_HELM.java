// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCRASH_HELM<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crash_helm"), "main");
	private final ModelPart warhead;

	public ModelCRASH_HELM(ModelPart root) {
		this.warhead = root.getChild("warhead");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition warhead = partdefinition.addOrReplaceChild("warhead",
				CubeListBuilder.create().texOffs(23, 34)
						.addBox(3.0F, -12.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 34)
						.addBox(-5.0F, -12.0F, 0.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0436F));

		PartDefinition cube_r1 = warhead
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(23, 34).addBox(-13.75F, -3.5F, 0.0F, 1.0F, 7.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5272F));

		PartDefinition cube_r2 = warhead
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(23, 34).addBox(-10.25F, -10.0F, 0.0F, 1.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r3 = warhead
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(23, 34).addBox(8.4F, -10.25F, 0.0F, 1.0F, 2.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r4 = warhead.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(58, 17).addBox(30.0F, 18.0F, 2.2F, 2.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, 15.0F, 0.0F, -0.0523F, 0.0357F, -1.6119F));

		PartDefinition cube_r5 = warhead.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(58, 17).addBox(9.7F, -35.75F, 0.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, 15.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r6 = warhead.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(58, 17)
						.addBox(20.2F, -34.0F, 0.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(25.0F, -21.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(18.0F, -23.0F, -5.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(24.0F, -23.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(16.0F, -21.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(16.0F, -27.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(25.0F, -27.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(24.0F, -24.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(24.0F, -25.0F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(17.0F, -24.0F, -5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(16.0F, -25.0F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(17.0F, -23.0F, 4.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(25.0F, -23.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(16.0F, -23.0F, -3.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(16.0F, -23.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, 15.0F, 0.0F, 0.0F, 0.0F, -0.0436F));

		PartDefinition cube_r7 = warhead.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(58, 17).addBox(31.2F, -19.0F, 0.0F, 2.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, 15.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r8 = warhead.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(54, 43).addBox(19.0F, -16.5F, -21.75F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, 15.0F, 0.0F, -0.9599F, 0.0F, -0.0436F));

		PartDefinition cube_r9 = warhead.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(54, 43).addBox(19.0F, -22.5F, 15.25F, 4.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, 15.0F, 0.0F, 0.5672F, 0.0F, -0.0436F));

		PartDefinition cube_r10 = warhead.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(31, 61)
						.addBox(-1.0F, -34.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-3.0F, -34.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 61)
						.addBox(-3.0F, -32.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 61)
						.addBox(-1.0F, -32.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.4F, 15.0F, 0.0F, 0.0F, 0.0F, 0.6981F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		warhead.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.warhead.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.warhead.xRot = headPitch / (180F / (float) Math.PI);
	}
}