// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCrazyH<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "crazyh"), "main");
	private final ModelPart bb_main;

	public ModelCrazyH(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 6).addBox(-6.0F, -11.3F, -9.9F, 3.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -1.8F, 8.6F, -0.3047F, -0.0666F, -0.0604F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(16, 34).addBox(-6.0F, -14.4F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -6.4F, -8.4F, -1.2654F, 0.0F, 0.0F));

		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 34).addBox(-6.0F, -14.3F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -1.8F, 8.6F, 0.1316F, -0.0666F, -0.0604F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(36, 21).addBox(-6.0F, -14.4F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -7.2F, -9.8F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(38, 0).addBox(-6.0F, -14.4F, -7.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.8F, -8.1F, -1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-11.05F, -12.0F, -11.8F, 3.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 1.7F, -2.1F, -0.5385F, 0.8792F, -0.3559F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(19, 16).addBox(-6.8F, -12.0F, -12.3F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.9F, 1.7F, -2.1F, -0.9976F, 1.1709F, -0.8843F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(24, 25).addBox(-5.6F, -16.5F, -10.9F, 3.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -13.3F, 15.6F, 1.1742F, 0.0206F, -0.0975F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 39).addBox(-5.6F, -11.7F, 11.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(12.0F, -13.3F, 15.6F, 2.7013F, 0.0206F, -0.0975F));

		PartDefinition cube_r10 = bb_main
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(40, 30).addBox(-6.0F, -17.6F, -5.5F, 3.0F, 3.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(8.0F, -2.7F, 5.6F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(40, 37).addBox(-6.0F, -15.5F, -8.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -2.7F, 5.6F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bb_main
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(0, 31).addBox(-6.0F, -11.7F, 10.0F, 3.0F, 3.0F, 5.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(4.0F, -2.2F, 6.2F, 1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(14, 41).addBox(-6.0F, -15.5F, -8.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -2.2F, 6.2F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(28, 41).addBox(-6.0F, -17.1F, 1.3F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.8F, -8.1F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(38, 44).addBox(-6.0F, -15.5F, -8.9F, 3.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.8F, -8.1F, -1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-3.0F, -6.9F, 5.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 17)
						.addBox(2.0F, -6.9F, 5.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(31, 16)
						.addBox(-3.0F, -5.9F, 5.1F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 7)
						.addBox(-3.0F, -7.9F, 5.1F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 16).addBox(4.9F, -14.5F, -5.5F, 4.0F, 4.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.7F, -8.6F, -1.3175F, -0.067F, 0.2533F));

		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -14.5F, -4.0F, 13.0F, 4.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.7F, -8.6F, -1.309F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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