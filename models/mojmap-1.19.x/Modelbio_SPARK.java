// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbio_SPARK<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "bio_spark"), "main");
	private final ModelPart bone;

	public Modelbio_SPARK(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 27)
						.addBox(-5.0F, -11.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-6.0F, -10.0F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-2.0F, -10.0F, -6.0F, 4.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(46, 50)
						.addBox(-0.5F, -8.0F, -6.0F, 1.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(20, 47)
						.addBox(6.0F, -10.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-7.0F, -10.0F, -6.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 14)
						.addBox(-7.0F, -11.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 27)
						.addBox(6.0F, -11.0F, -1.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -12.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(30, 27)
						.addBox(-6.0F, -5.0F, -6.0F, 12.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-6.0F, -3.0F, -6.0F, 12.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 14)
						.addBox(-6.0F, -4.0F, -5.75F, 12.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-10.0F, -6.0F, -3.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 50)
						.addBox(-8.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 50)
						.addBox(7.0F, -6.0F, -1.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, -6.0F, -3.0F, 2.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(70, 0).addBox(-12.0F, -5.0F, 4.0F, 1.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0436F, 0.6545F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(36, 23).addBox(-15.0F, 5.0F, 3.0F, 18.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0436F, 0.6545F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 21).addBox(-1.0F, -14.25F, -22.25F, 2.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.75F, -10.0F, -2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 61).addBox(-2.0F, -18.25F, -18.25F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.75F, -10.0F, -1.7017F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(63, 26).addBox(-2.0F, -20.5F, -13.5F, 4.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.75F, -10.0F, -1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(34, 50).addBox(-3.0F, -22.0F, -7.5F, 6.0F, 6.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.75F, -10.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(74, 57).addBox(-2.0F, -16.0F, -0.75F, 4.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.75F, -8.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(30, 37).addBox(-5.0F, -14.0F, -6.75F, 10.0F, 3.0F, 10.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 27)
						.addBox(-6.0F, -9.0F, 1.5F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(5.0F, -9.0F, 1.5F, 1.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(0, 7).addBox(4.0F, -7.0F, -6.0F, 4.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r11 = bone
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(0, 9).addBox(-8.0F, -7.0F, -6.0F, 4.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r12 = bone
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(60, 37).addBox(1.0F, -1.0F, -8.0F, 4.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition cube_r13 = bone
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(60, 50).addBox(-5.0F, -1.0F, -8.0F, 4.0F, 1.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}