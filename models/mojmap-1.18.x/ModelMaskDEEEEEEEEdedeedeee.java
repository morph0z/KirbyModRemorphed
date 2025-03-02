// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMaskDEEEEEEEEdedeedeee<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "maskdeeeeeeeededeedeee"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;
	private final ModelPart bb_main;

	public ModelMaskDEEEEEEEEdedeedeee(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 57)
						.addBox(3.0F, -20.0F, -4.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 62)
						.addBox(2.0F, -17.0F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(13, 54)
						.addBox(-2.0F, -17.0F, -5.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 46)
						.addBox(-2.0F, -15.0F, -3.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 57)
						.addBox(-4.0F, -20.0F, -4.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-3.0F, -17.0F, -4.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(52, 8)
						.addBox(3.0F, -18.5F, -11.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 37)
						.addBox(-4.0F, -19.5F, -10.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 13)
						.addBox(-4.0F, -18.5F, -11.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(3.0F, -19.5F, -10.25F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(40, 49).addBox(16.75F, 1.5F, 7.0F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, -32.25F, -13.0F, -0.6375F, -0.3863F, 1.608F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(36, 26).addBox(15.5F, -2.5F, 10.25F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.5F, -32.25F, -13.0F, -1.0104F, -0.2892F, 1.4357F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(40, 26).addBox(15.5F, -2.5F, 10.25F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 1.0F, 0.0F, -1.1185F, 0.4892F, -1.8485F));

		PartDefinition cube_r5 = bone
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(52, 43).addBox(4.25F, -18.75F, -4.0F, 4.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r6 = bone
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(40, 8).addBox(-8.25F, -18.75F, -4.0F, 4.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r7 = bone
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(62, 0).addBox(5.25F, -20.75F, -4.0F, 2.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r8 = bone
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(62, 13).addBox(-7.25F, -20.75F, -4.0F, 2.0F, 1.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(58, 47)
						.addBox(-0.5F, -25.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 18)
						.addBox(-1.0F, -24.0F, -4.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(47, 55).addBox(16.75F, 1.5F, 7.0F, 2.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, 1.0F, 0.0F, -0.6089F, 0.3986F, -1.6643F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(56, 8)
						.addBox(-7.0F, -10.0F, 6.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-8.0F, -11.0F, 5.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 55)
						.addBox(-1.0F, -10.4F, 5.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(37, 55)
						.addBox(-2.0F, -8.4F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 26)
						.addBox(-2.0F, -11.4F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 43)
						.addBox(-2.0F, -10.4F, 5.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-3.0F, -10.4F, 5.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.3873F, 1.0823F, 2.3251F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(55, 0)
						.addBox(-10.0F, -13.4F, 1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(22, 48)
						.addBox(-9.0F, -11.4F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -13.4F, 1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -10.0F, 14.0F, 2.0349F, -0.4696F, -0.5772F));

		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(56, 26)
						.addBox(7.0F, 11.35F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 55)
						.addBox(7.0F, 11.35F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 55)
						.addBox(7.0F, 7.35F, 1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 58)
						.addBox(13.9F, 25.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 62)
						.addBox(13.9F, 20.35F, -1.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 59)
						.addBox(13.9F, 20.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(31, 63)
						.addBox(13.9F, 20.35F, 3.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 55)
						.addBox(12.9F, 21.35F, -0.4F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 59)
						.addBox(8.9F, 26.35F, 0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 32)
						.addBox(4.9F, 26.35F, 0.6F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(2.9F, 20.35F, -1.4F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(41, 55)
						.addBox(1.9F, 21.35F, -0.4F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 18)
						.addBox(0.9F, 20.35F, -1.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 51)
						.addBox(0.9F, 20.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(0.9F, 21.35F, 0.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 13)
						.addBox(0.9F, 25.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 48)
						.addBox(0.9F, 22.35F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(50, 62)
						.addBox(0.9F, 20.35F, 3.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -10.0F, 14.0F, -2.0349F, 0.4696F, 2.5643F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 18)
						.addBox(-5.0F, -13.0F, -2.0F, 10.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 11)
						.addBox(-4.0F, -21.0F, -2.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -14.0F, -1.0F, 12.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(28, 28)
						.addBox(-5.0F, -21.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 28)
						.addBox(4.0F, -21.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 48)
						.addBox(-1.0F, -25.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 37)
						.addBox(-3.0F, -23.0F, -1.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 28)
						.addBox(-5.0F, -21.0F, -1.0F, 10.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -22.0F, -2.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(26, 37)
						.addBox(-6.0F, -13.0F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 46)
						.addBox(-5.0F, -14.0F, 1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -10.0F, 14.0F, 2.0349F, -0.4696F, -0.5772F));

		PartDefinition cube_r16 = bb_main
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(32, 37).addBox(-5.0F, -3.0F, -6.0F, 4.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r17 = bb_main
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(26, 46).addBox(1.0F, -3.0F, -6.0F, 4.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0908F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}