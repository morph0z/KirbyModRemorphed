// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bone;
	private final ModelPart bone2;

	public Modelcustom_model(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -14.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(0, 53).addBox(5.0F, -11.0F, 6.0F, 15.0F, 7.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5236F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 53).addBox(-20.0F, -11.0F, 6.0F, 15.0F, 7.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition cube_r3 = bone
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(0, 24).addBox(-6.0F, -2.0F, -7.0F, 5.0F, 2.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r4 = bone
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(19, 26).addBox(1.0F, -2.0F, -7.0F, 5.0F, 2.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(25, 46)
						.addBox(0.0F, -13.0F, -4.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(1.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.2182F, 0.3927F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(38, 46)
						.addBox(-7.0F, -13.0F, -4.0F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-6.0F, -12.0F, -3.0F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.2182F, -0.3927F));

		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(38, 39)
						.addBox(-6.0F, -14.0F, -7.0F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 58)
						.addBox(-6.0F, -7.0F, -7.0F, 12.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-6.0F, -12.0F, -7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(5.0F, -12.0F, -7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(40, 41)
						.addBox(1.0F, -7.5F, -7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 34)
						.addBox(2.0F, -12.0F, -7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 61)
						.addBox(-7.0F, -7.5F, -7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 61)
						.addBox(-8.0F, -12.0F, -7.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}