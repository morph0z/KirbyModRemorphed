// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhothead<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hothead"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public Modelhothead(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(0, 19)
						.addBox(-6.0F, -14.0F, -6.0F, 12.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -7.0F, -7.0F, 14.0F, 5.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(46, 65)
						.addBox(-7.0F, -14.0F, 3.0F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(65, 44)
						.addBox(6.0F, -14.0F, 2.9F, 1.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bone
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(48, 17).addBox(-6.0F, -2.0F, -9.0F, 5.0F, 2.0F, 12.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r2 = bone
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 47).addBox(1.0F, -2.0F, -9.0F, 5.0F, 2.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 38)
						.addBox(-7.0F, -12.5F, 6.0F, 14.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(34, 0)
						.addBox(-7.0F, -12.5F, 6.0F, 14.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(86, 49)
						.addBox(-7.0F, -1.5F, 7.0F, 14.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(54, 55)
						.addBox(6.0F, -12.5F, 7.0F, 1.0F, 12.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(94, 0)
						.addBox(-6.0F, -8.5F, 9.0F, 12.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(95, 28)
						.addBox(-6.0F, 1.5F, 10.0F, 12.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(36, 46)
						.addBox(6.0F, -8.5F, 10.0F, 0.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(38, 47).addBox(5.75F, -1.5F, 11.0F, 0.0F, 10.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, -3.1416F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(54, 54).addBox(5.95F, 0.5F, 7.0F, 1.0F, 12.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2182F, 0.0F, -3.1416F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-2.0F, -8.0F, -7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -9.0F, -8.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
						.addBox(-3.0F, -9.0F, -9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-2.0F, -4.0F, -9.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 7)
						.addBox(2.0F, -9.0F, -9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
						.addBox(-2.0F, -9.0F, -9.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-6.0F, -15.0F, -7.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(2.0F, -15.0F, -7.0F, 4.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

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