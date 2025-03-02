// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelbetterstayelllllllo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "betterstayelllllllo"), "main");
	private final ModelPart bone;

	public Modelbetterstayelllllllo(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 17)
				.addBox(-2.75F, -5.0F, -24.0F, 5.0F, 7.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 5).addBox(0.25F, -5.0F, -4.25F, 4.0F, 7.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.2217F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -5.0F, -3.75F, 4.0F, 7.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6981F, 0.0F));

		PartDefinition cube_r3 = bone
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(6, 8).addBox(1.0F, -5.0F, -1.75F, 4.0F, 7.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.1345F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 17).addBox(-21.25F, -5.0F, 9.75F, 7.0F, 7.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.25F, 4.0F, -3.1416F, 1.3526F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 17).addBox(-13.25F, -5.0F, 7.75F, 10.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.25F, 4.0F, -3.1416F, 1.4835F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 17).addBox(-2.25F, -5.0F, 1.75F, 8.0F, 7.0F, 17.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.25F, 4.0F, 0.0F, 1.2654F, -3.1416F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 17).addBox(6.75F, -5.0F, 7.75F, 10.0F, 7.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -3.25F, 4.0F, 0.0F, 0.9599F, -3.1416F));

		PartDefinition cube_r8 = bone
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(0, 17).addBox(-13.25F, -5.0F, 7.75F, 10.0F, 7.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.4399F, 0.0F));

		PartDefinition cube_r9 = bone
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(0, 17).addBox(-24.25F, -5.0F, 6.75F, 7.0F, 7.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.789F, 0.0F));

		PartDefinition cube_r10 = bone
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(0, 17).addBox(-2.25F, -5.0F, 1.75F, 8.0F, 7.0F, 17.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0472F, 0.0F));

		PartDefinition cube_r11 = bone
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(0, 17).addBox(6.75F, -5.0F, 7.75F, 10.0F, 7.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7418F, 0.0F));

		PartDefinition cube_r12 = bone
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, -24.0F, 5.0F, 7.0F, 48.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(17, 17)
						.addBox(-25.0F, -5.0F, 3.25F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(17, 17)
						.addBox(-3.0F, -5.0F, -1.0F, 5.0F, 7.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r14 = bone
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(17, 17).addBox(-21.0F, -5.0F, 5.75F, 5.0F, 7.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.48F, 0.0F));

		PartDefinition cube_r15 = bone
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(17, 17).addBox(-12.0F, -5.0F, 10.75F, 5.0F, 7.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r16 = bone
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(17, 17).addBox(-9.0F, -5.0F, 1.75F, 19.0F, 7.0F, 18.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.0436F, 0.0F));

		PartDefinition cube_r17 = bone.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(17, 17)
						.addBox(3.0F, -5.0F, 11.75F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(13.75F, -5.0F, -8.5F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(17, 17)
						.addBox(10.0F, -5.0F, 10.75F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(17, 17)
						.addBox(15.0F, -5.0F, 10.75F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3054F, 0.0F));

		PartDefinition cube_r19 = bone
				.addOrReplaceChild("cube_r19",
						CubeListBuilder.create().texOffs(20, 0).addBox(-3.0F, -5.0F, -0.5F, 5.0F, 7.0F, 28.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r20 = bone.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 17).addBox(-20.0F, -5.0F, -11.0F, 12.0F, 7.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.0F, -1.1781F, -3.1416F));

		PartDefinition cube_r21 = bone.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(0, 17).addBox(-15.0F, -5.0F, -13.0F, 16.0F, 7.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.0F, -1.0036F, -3.1416F));

		PartDefinition cube_r22 = bone.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(0, 17).addBox(3.5F, -5.0F, -13.0F, 9.0F, 7.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.0F, -0.4363F, -3.1416F));

		PartDefinition cube_r23 = bone.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(0, 17).addBox(13.75F, -5.0F, -8.5F, 9.0F, 7.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 1.0F, 0.0F, -0.1309F, -3.1416F));

		PartDefinition cube_r24 = bone
				.addOrReplaceChild("cube_r24",
						CubeListBuilder.create().texOffs(0, 17).addBox(3.5F, -5.0F, -13.0F, 9.0F, 7.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.48F, 0.0F));

		PartDefinition cube_r25 = bone
				.addOrReplaceChild("cube_r25",
						CubeListBuilder.create().texOffs(0, 17).addBox(-10.0F, -5.0F, -13.0F, 11.0F, 7.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r26 = bone
				.addOrReplaceChild("cube_r26",
						CubeListBuilder.create().texOffs(0, 17).addBox(-21.0F, -5.0F, -11.0F, 13.0F, 7.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.2217F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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