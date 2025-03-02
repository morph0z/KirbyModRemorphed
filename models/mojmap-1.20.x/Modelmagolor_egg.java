// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelmagolor_egg<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "magolor_egg"), "main");
	private final ModelPart bone;

	public Modelmagolor_egg(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(30, 10)
						.addBox(-5.0F, -14.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(60, 0)
						.addBox(-5.0F, -14.0F, 5.0F, 10.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(5.0F, -14.0F, -6.0F, 1.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(28, 21)
						.addBox(-6.0F, -14.0F, -6.0F, 1.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-5.0F, -3.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(56, 40)
						.addBox(-5.0F, -4.0F, -6.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 37)
						.addBox(-5.0F, -14.0F, -6.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 37)
						.addBox(-5.0F, -12.0F, -6.0F, 3.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 31)
						.addBox(2.0F, -12.0F, -6.0F, 3.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 31)
						.addBox(-4.0F, -4.5F, -6.0F, 2.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 39)
						.addBox(2.0F, -4.5F, -6.0F, 2.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 21)
						.addBox(3.0F, -11.5F, -6.0F, 2.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 41)
						.addBox(-5.0F, -11.5F, -6.0F, 2.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 35)
						.addBox(-5.0F, -11.0F, -6.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(4.0F, -11.0F, -6.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 5)
						.addBox(-7.0F, -8.5F, -7.0F, 14.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(5, 70)
						.addBox(2.0F, -8.0F, -7.25F, 2.0F, 0.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(0, 66)
						.addBox(2.0F, -5.5F, -7.25F, 2.0F, 0.5F, 0.25F, new CubeDeformation(0.0F)).texOffs(9, 4)
						.addBox(1.5F, -8.0F, -7.25F, 0.5F, 3.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(8, 2)
						.addBox(4.0F, -8.0F, -7.25F, 0.5F, 3.0F, 0.25F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-7.0F, -8.5F, 6.0F, 14.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 43)
						.addBox(-7.0F, -8.5F, -6.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(42, 33)
						.addBox(6.0F, -8.5F, -6.0F, 1.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.0F, -13.0F, -5.0F, 10.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(30, 27)
						.addBox(11.0F, 2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(73, 55)
						.addBox(11.0F, 3.0F, -1.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 48).addBox(-7.0F, -4.0F, -5.0F, 0.0F, 5.5F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(28, 37).addBox(6.75F, -3.75F, -6.0F, 0.0F, 5.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, -1.3963F, -1.5708F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(8, 33).addBox(-9.0F, -3.75F, 0.5F, 0.0F, 5.0F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.9449F, 0.895F, 2.8946F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(14, 35).addBox(9.0F, -4.0F, 0.5F, 0.0F, 5.0F, 1.5F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.0224F, -0.9024F, -2.9637F));

		PartDefinition cube_r6 = bone
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(22, 48).addBox(7.0F, -4.0F, -5.0F, 0.0F, 5.5F, 11.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(46, 49)
						.addBox(-5.5F, -15.0F, -6.75F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(60, 13)
						.addBox(-4.5F, -18.0F, -5.75F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 20)
						.addBox(-3.0F, -19.5F, -4.25F, 1.0F, 0.5F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-3.75F, -19.0F, -5.0F, 2.5F, 1.0F, 2.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.6109F, 0.0F, 0.6109F));

		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(2.0F, -19.75F, -4.25F, 1.0F, 0.75F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, -1)
						.addBox(1.25F, -19.0F, -5.0F, 2.5F, 1.0F, 2.5F, new CubeDeformation(0.0F)).texOffs(64, 45)
						.addBox(0.5F, -18.0F, -5.75F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 21)
						.addBox(-0.5F, -15.0F, -6.75F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, -0.6109F, 0.0F, -0.6109F));

		PartDefinition hand1 = bone.addOrReplaceChild("hand1", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, -9.0F, 0.0F, 0.0F, 0.0F, -1.0472F));

		PartDefinition cube_r9 = hand1
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(0, 20).addBox(-0.1522F, -13.2346F, -1.0F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition cube_r10 = hand1.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 0).addBox(-0.632F, -13.2346F, 0.7363F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -3.1416F, 1.2217F, 2.2253F));

		PartDefinition cube_r11 = hand1.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(30, 21).addBox(0.1032F, -13.2346F, 0.139F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, 0.0F, 1.0908F, -0.9163F));

		PartDefinition cube_r12 = hand1.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 26).addBox(0.0978F, -9.2808F, -4.7382F, 2.0F, 1.5F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 1.0F, 0.0F, -0.3491F, 0.0F, -0.9163F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}