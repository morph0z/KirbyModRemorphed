// Made with Blockbench 4.7.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelknuckleJoe<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "knucklejoe"), "main");
	private final ModelPart bb_main;

	public ModelknuckleJoe(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(69, 119)
						.addBox(-6.0F, -2.0F, -2.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(49, 119)
						.addBox(3.0F, -2.0F, -2.0F, 3.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(82, 96)
						.addBox(3.5F, -3.0F, 2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 131)
						.addBox(-5.5F, -3.0F, 2.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 134)
						.addBox(-6.5F, -5.0F, 1.5F, 3.8F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 119)
						.addBox(2.5F, -5.0F, 1.5F, 3.8F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(52, 101)
						.addBox(-7.5F, -7.0F, 0.5F, 5.8F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 99)
						.addBox(1.5F, -7.0F, 0.5F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(197, 0)
						.addBox(-7.5F, -16.0F, 0.5F, 15.05F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 117)
						.addBox(-5.0F, -17.0F, -0.5F, 10.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 107)
						.addBox(-6.0F, -14.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 99)
						.addBox(5.0F, -14.0F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(81, 106)
						.addBox(-4.0F, -9.0F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(70, 87)
						.addBox(-5.5F, -17.0F, -1.0F, 10.75F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(10, 180)
						.addBox(-5.5F, -17.0F, -1.0F, 0.5F, 2.0F, 7.5F, new CubeDeformation(0.0F)).texOffs(71, 101)
						.addBox(5.0F, -17.0F, -1.0F, 0.5F, 2.0F, 7.75F, new CubeDeformation(0.0F)).texOffs(217, 237)
						.addBox(-5.5F, -17.0F, 6.25F, 10.75F, 2.0F, 0.5F, new CubeDeformation(0.0F)).texOffs(102, 17)
						.addBox(-1.5F, -18.0F, -1.0F, 2.75F, 1.0F, 7.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(72, 119)
						.addBox(-7.25F, -22.0F, 3.0F, 1.0F, 4.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(64, 128)
						.addBox(-4.5F, -21.0F, -0.5F, 1.0F, 3.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(70, 100)
						.addBox(-7.5F, -21.0F, 4.5F, 2.0F, 3.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(34, 126)
						.addBox(-5.5F, -20.0F, 2.5F, 2.0F, 2.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(162, 110)
						.addBox(-7.5F, -21.0F, 0.5F, 3.0F, 3.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(34, 107)
						.addBox(-7.5F, -18.0F, -0.5F, 4.0F, 3.0F, 6.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(57, 112)
						.addBox(6.0F, -20.0F, 3.5F, 1.0F, 2.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(71, 111)
						.addBox(3.5F, -20.0F, -0.5F, 3.0F, 2.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(62, 119)
						.addBox(4.5F, -21.0F, 1.5F, 3.0F, 3.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(34, 130)
						.addBox(3.5F, -20.0F, 4.5F, 2.0F, 2.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(56, 109)
						.addBox(3.5F, -18.0F, -0.5F, 4.0F, 3.0F, 6.75F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.48F));

		PartDefinition cube_r3 = bb_main
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(44, 128).addBox(-15.5F, 2.0F, 6.25F, 4.75F, 2.0F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.7017F));

		PartDefinition cube_r4 = bb_main
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(81, 128).addBox(-13.5F, -10.0F, 6.25F, 4.75F, 2.0F, 0.5F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.9599F));

		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(56, 99)
						.addBox(-5.75F, -17.0F, -5.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 84)
						.addBox(-5.75F, -16.0F, -5.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.829F, 0.0F));

		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(57, 109)
						.addBox(4.75F, -17.0F, -5.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 99)
						.addBox(3.75F, -16.0F, -5.25F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.829F, 0.0F));

		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(52, 128)
						.addBox(-5.1F, -16.5F, 0.5F, 3.5F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 90)
						.addBox(-1.65F, -16.0F, 1.0F, 5.05F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -23.0F, -5.0F, -0.9869F, -1.176F, -1.927F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(83, 181).addBox(-1.5F, -16.0F, 2.0F, 5.05F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -23.0F, -5.0F, -0.3452F, -0.3227F, -2.763F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(78, 111)
						.addBox(-5.1F, -16.5F, 0.5F, 3.5F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(81, 100)
						.addBox(-1.65F, -16.0F, 1.0F, 5.05F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.3963F, -0.5672F));

		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(81, 131).addBox(-1.5F, -16.0F, 2.0F, 5.05F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, -0.5672F));

		return LayerDefinition.create(meshdefinition, 240, 240);
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