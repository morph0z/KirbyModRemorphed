// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelice_on_my_head<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "ice_on_my_head"), "main");
	private final ModelPart bone13;

	public Modelice_on_my_head(ModelPart root) {
		this.bone13 = root.getChild("bone13");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone13 = partdefinition.addOrReplaceChild("bone13",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-3.5F, -13.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-1.5F, -13.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(0.5F, -10.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(0.5F, -14.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-1.5F, -12.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(-2.0F, -12.0F, -2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 15)
						.addBox(-2.0F, -11.0F, 0.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(0.0F, -13.0F, 0.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 17)
						.addBox(0.0F, -9.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-0.5F, -10.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-1.5F, -9.0F, -6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bone13.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 18).addBox(10.75F, -30.5F, -6.0F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r2 = bone13
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 18).addBox(-11.75F, -30.5F, -6.0F, 1.0F, 2.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition bone12 = bone13.addOrReplaceChild("bone12",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(2.5F, -38.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(2.0F, -37.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone11 = bone13.addOrReplaceChild("bone11",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(2.5F, -37.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(2.0F, -36.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone10 = bone13.addOrReplaceChild("bone10",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(2.5F, -39.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -38.0F, 2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone9 = bone13.addOrReplaceChild("bone9",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(0.5F, -36.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 15)
						.addBox(0.0F, -35.0F, 2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone8 = bone13.addOrReplaceChild("bone8",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-1.5F, -38.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-2.0F, -37.0F, 2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone7 = bone13.addOrReplaceChild("bone7",
				CubeListBuilder.create().texOffs(16, 11)
						.addBox(-4.0F, -34.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(6, 0)
						.addBox(-3.5F, -35.0F, 2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone6 = bone13.addOrReplaceChild("bone6",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-3.5F, -38.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-4.0F, -37.0F, -2.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone5 = bone13.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-3.5F, -39.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -38.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone4 = bone13.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-3.5F, -37.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(-4.0F, -36.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone3 = bone13.addOrReplaceChild("bone3",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(-1.5F, -38.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-2.0F, -37.0F, -4.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone2 = bone13.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(0.5F, -36.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 15)
						.addBox(0.0F, -35.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = bone13.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(6, 0)
						.addBox(2.5F, -39.0F, -3.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(2.0F, -38.0F, -4.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone13.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}