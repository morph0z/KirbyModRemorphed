// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelMasterH<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "masterh"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public ModelMasterH(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(12.0F, 20.7F, 7.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(26, 27).addBox(-6.0F, -14.4F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.2F, -0.4F, -0.2618F, -0.0846F, -0.0303F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 34).addBox(-6.0F, -17.6F, -5.5F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, -4.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(36, 30).addBox(-6.0F, -15.5F, -8.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, -4.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(36, 21).addBox(-6.0F, -14.4F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, -4.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(34, 37).addBox(-6.0F, -16.7F, -9.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -0.7F, -7.0F, -0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(38, 0).addBox(-6.0F, -15.5F, -8.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -0.7F, -7.0F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(0, 38).addBox(-6.0F, -14.4F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -0.7F, -7.0F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(14, 38).addBox(-6.0F, -16.7F, -9.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, -1.3F, -8.8F, -0.48F, 0.0F, 0.0F));

		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(24, 41).addBox(-6.0F, -15.5F, -8.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, -1.3F, -8.8F, -0.6545F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.75F, -12.0F, -13.3F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.4F, 1.5F, -4.9F, -0.697F, 0.8748F, -0.1824F));

		PartDefinition cube_r11 = bone.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(19, 16).addBox(-9.0F, -12.0F, -10.3F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.4F, 1.5F, -4.9F, -0.5672F, 0.6981F, 0.0F));

		PartDefinition cube_r12 = bone.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(34, 44).addBox(-6.0F, -14.4F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-12.0F, -1.3F, -8.8F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(14, 31).addBox(-6.0F, -17.6F, -5.5F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, -1.3F, 2.6F, 0.5668F, -0.0741F, -0.0667F));

		PartDefinition cube_r14 = bone.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 31).addBox(-6.0F, -15.5F, -8.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.3F, -1.3F, 2.6F, 0.1305F, -0.0741F, -0.0667F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 16).addBox(4.9F, -14.5F, -5.5F, 3.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.7F, -2.6F, -0.6272F, -0.2136F, 0.1525F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -14.5F, -4.0F, 13.0F, 4.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.7F, -2.6F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 6)
						.addBox(2.8F, -14.7F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-2.2F, -14.7F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 16)
						.addBox(-2.2F, -15.7F, 3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 7)
						.addBox(-2.2F, -13.7F, 3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}