// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldedeedeeee<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dedeedeeee"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public Modeldedeedeeee(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-10.0F, 19.0F, -7.0F, -0.5864F, 0.6248F, 0.7219F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(12, 49)
						.addBox(7.0F, 11.35F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 49)
						.addBox(7.0F, 7.35F, 1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 56)
						.addBox(1.9F, 20.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(10, 58)
						.addBox(1.9F, 20.35F, 3.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 19)
						.addBox(1.9F, 20.35F, -1.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 8)
						.addBox(1.9F, 22.35F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(1.9F, 21.35F, 0.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 14)
						.addBox(1.9F, 25.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 61)
						.addBox(12.9F, 20.35F, 3.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 55)
						.addBox(12.9F, 20.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 60)
						.addBox(12.9F, 20.35F, -1.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 27)
						.addBox(12.9F, 22.35F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
						.addBox(12.9F, 25.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(12.9F, 21.35F, 0.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(2.9F, 20.35F, -1.4F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 58)
						.addBox(1.9F, 20.35F, 3.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 56)
						.addBox(1.9F, 20.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(1.9F, 21.35F, 0.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 19)
						.addBox(1.9F, 20.35F, -1.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 14)
						.addBox(1.9F, 25.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 8)
						.addBox(1.9F, 22.35F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 27)
						.addBox(12.9F, 22.35F, -0.4F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(12.9F, 21.35F, 0.6F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 57)
						.addBox(12.9F, 25.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(57, 55)
						.addBox(12.9F, 20.35F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(60, 60)
						.addBox(12.9F, 20.35F, -1.4F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 61)
						.addBox(12.9F, 20.35F, 3.6F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(2.9F, 20.35F, -1.4F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(16, 49)
						.addBox(7.0F, 7.35F, 1.0F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(7.0F, 11.35F, 2.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.7925F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(20, 50)
						.addBox(-10.0F, -13.4F, 1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 59)
						.addBox(-9.0F, -11.4F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -13.4F, 1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(26, 38)
						.addBox(-6.0F, -13.0F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
						.addBox(-5.0F, -14.0F, 1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-5.0F, -13.0F, -2.0F, 10.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(33, 12)
						.addBox(-4.0F, -21.0F, -2.0F, 8.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(57, 50)
						.addBox(-2.0F, -14.0F, -3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -14.0F, -1.0F, 12.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(66, 5)
						.addBox(-1.0F, -25.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 50)
						.addBox(-0.5F, -24.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 47)
						.addBox(-3.0F, -23.0F, -1.0F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(27, 28)
						.addBox(-5.0F, -21.0F, -3.0F, 10.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-4.0F, -22.0F, -2.0F, 8.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 38)
						.addBox(-1.0F, -17.5F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 41)
						.addBox(-1.0F, -23.0F, -3.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 8)
						.addBox(-3.0F, -16.5F, -3.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(30, 53)
						.addBox(7.0F, -13.4F, 1.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(27, 49)
						.addBox(6.0F, -14.4F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 60)
						.addBox(6.0F, -11.4F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
						.addBox(6.0F, -13.4F, 1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(5.0F, -13.4F, 1.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(55, 0)
						.addBox(1.0F, -13.0F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 50)
						.addBox(0.0F, -14.0F, 1.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(46, 38)
						.addBox(3.0F, -13.75F, -3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 60)
						.addBox(6.0F, -14.75F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(56, 33)
						.addBox(-7.0F, -13.75F, -3.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 42)
						.addBox(-8.0F, -14.75F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r8 = bb_main
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(32, 38).addBox(-5.0F, -3.0F, -6.0F, 4.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.0908F, 0.0F));

		PartDefinition cube_r9 = bb_main
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(46, 41).addBox(1.0F, -3.0F, -6.0F, 4.0F, 3.0F, 6.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0908F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}